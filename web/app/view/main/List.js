/**
 * This view is an example list of people.
 */
Ext.define('CoffeeShop.view.main.List', {
    extend: 'Ext.grid.Panel',
    xtype: 'mainlist',
    /*
    filter by is used by the before render function in MainController to filter the inventory store and based on
    the results from that filtering different items are added to this panel for display. Defaults to none.
    */
    filterBy: 'none',

    requires: [
        'CoffeeShop.store.Inventory'
    ],

    title: 'Inventory',

    store: {
        type: 'inventory'
    },

    columns: [
        { text: 'Name',  dataIndex: 'name', flex: 1 },
        { text: 'Description', dataIndex: 'description', flex: 2 },
        { text: 'Price', dataIndex: 'price', flex: 1, formatter: 'usMoney' }
    ],

    listeners: {
        select: 'onItemSelected'
    }
});
