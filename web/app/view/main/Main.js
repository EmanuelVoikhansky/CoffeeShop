/**
 * This class is the main view for the application. It is specified in app.js as the
 * "mainView" property. That setting automatically applies the "viewport"
 * plugin causing this view to become the body element (i.e., the viewport).
 *
 */
Ext.define('CoffeeShop.view.main.Main', {
    extend: 'Ext.tab.Panel',
    xtype: 'app-main',

    requires: [
        'Ext.plugin.Viewport',
        'Ext.window.MessageBox',

        'CoffeeShop.view.main.MainController',
        'CoffeeShop.view.main.MainModel',
        'CoffeeShop.view.main.List'
    ],

    curTab: 'all',

    controller: 'main',
    viewModel: 'main',

    ui: 'navigation',

    tabBarHeaderPosition: 1,
    titleRotation: 0,
    tabRotation: 0,
    listeners: {
        beforetabchange: 'beforeTabChange'
    },

    header: {
        layout: {
            align: 'stretchmax'
        },
        title: {
            bind: {
                text: '{name}'
            },
            flex: 0
        },
        iconCls: 'fa-coffee'
    },

    tabBar: {
        flex: 1,
        layout: {
            align: 'stretch',
            overflowHandler: 'none'
        }
    },

    responsiveConfig: {
        tall: {
            headerPosition: 'top'
        },
        wide: {
            headerPosition: 'left'
        }
    },

    defaults: {
        bodyPadding: 20,
        tabConfig: {
            plugins: 'responsive',
            responsiveConfig: {
                wide: {
                    iconAlign: 'left',
                    textAlign: 'left'
                },
                tall: {
                    iconAlign: 'top',
                    textAlign: 'center',
                    width: 80
                }
            }
        }
    },

    items: [{
        title: 'All Items',
        iconCls: 'fa-circle',
        // The following grid shares a store with the classic version's grid as well!
        items: [{
            xtype: 'mainlist',
            filterBy: 'none'
        }]
    }, {
        title: 'Coffee Beans',
        iconCls: 'fa-circle-o',
        items: [{
            xtype: 'mainlist',
            filterBy: 'beans'
        }]
    }, {
        title: 'Instant Coffee',
        iconCls: 'fa-circle-o',
        items: [{
            xtype: 'mainlist',
            filterBy: 'ground'
        }]
    }, {
        title: 'Coffee Mugs',
        iconCls: 'fa-circle-o',
        items: [{
            xtype: 'mainlist',
            filterBy: 'cup'
        }]
    }]
});
