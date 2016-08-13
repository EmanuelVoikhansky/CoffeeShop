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
        Ext.Msg.confirm('Item added to cart', 'Proceed to checkout?', 'onConfirm', this);
    },

    onConfirm: function (choice) {
        if (choice === 'yes') {
            //
        }
    },

    beforeTabChange: function (tabPanel, newTab, oldTab) {
        var store = Ext.data.StoreManager.lookup('inventory');
        newTab.setIconCls('fa-circle');
        oldTab.setIconCls('fa-circle-o');
        if (newTab.filterBy === 'none') {
            store.clearFilter();
        } else {
            store.filter('category', newTab.filterBy);
        }
        console.log(store.getData())
    }
});
