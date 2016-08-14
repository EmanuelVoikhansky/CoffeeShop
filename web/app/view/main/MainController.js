/**
 * This class is the controller for the main view for the application. It is specified as
 * the "controller" of the Main view class.
 *
 * TODO - Replace this content of this view to suite the needs of your application.
 */
Ext.define('CoffeeShop.view.main.MainController', {
    extend: 'Ext.app.ViewController',

    alias: 'controller.main',

    onItemSelected: function (sender, record) {
         var window = Ext.create({
            xtype: 'window',
            modal: true,
            autoshow: true,
            items: [
                {
                    xtype: 'item-card',
                    item: record.data
                }
            ]
        });
        window.show();
    },

    onConfirm: function (choice) {
        if (choice === 'yes') {
            //
        }
    },

    beforeTabRender: function(grid) {
        var store = grid.getStore();
        if (grid.filterBy === 'none') {
            store.clearFilter();
        } else {
            store.filter('category', grid.filterBy);
        }
    },

    beforeTabChange: function (tabPanel, newTab, oldTab) {
        newTab.setIconCls('fa-circle');
        oldTab.setIconCls('fa-circle-o');
    }
});
