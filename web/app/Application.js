/**
 * The main application class. An instance of this class is created by app.js when it
 * calls Ext.application(). This is the ideal place to handle application launch and
 * initialization details.
 */
Ext.define('CoffeeShop.Application', {
    extend: 'Ext.app.Application',
    
    name: 'CoffeeShop',

    requires: [
        'CoffeeShop.store.Inventory'
    ],
    
    launch: function () {
    },

    onAppUpdate: function () {
        Ext.Msg.confirm('Application Update', 'This application has an update, reload?',
            function (choice) {
                if (choice === 'yes') {
                    window.location.reload();
                }
            }
        );
    }
});
