Ext.define('CoffeeShop.view.itemcard.ItemCardController', {
    extend: 'Ext.app.ViewController',

    alias: 'controller.itemCard',

    onItemCardRender: function(card) {
        card.setTitle(card.item.name);
        card.lookupReference('imagePanel').setSrc(card.item.image);
        card.lookupReference('description').setValue(card.item.description);
    }
})
