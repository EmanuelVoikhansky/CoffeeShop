Ext.define('CoffeeShop.view.itemcard.ItemCard', {
    extend: 'Ext.panel.Panel',
    xtype: 'item-card',
    height: 600,
    width: 600,
    item: {}, //set on creation, use data binding to display image, description, title, ect.
    //title: title is set by the beforeRender listener
    numToBuy: 0,
    layout: 'border',
    controller: 'itemCard',
    listeners: {
        beforerender: 'onItemCardRender'
    },
    items: [
        {
            xtype: 'image',
            reference: 'imagePanel',
            //src: item.image,
            region: 'west',
            height: 500,
            width: 300
        },
        {
            xtype: 'textareafield',
            grow: true,
            editable: false,
            reference: 'description',
            //value: item.description,
            fieldLabel: 'Product Description',
            labelAlign: 'top',
            height: 500,
            width: 300
        }
    ]
})