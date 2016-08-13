Ext.define('CoffeeShop.store.Inventory', {
    extend: 'Ext.data.Store',

    alias: 'store.inventory',

    storeId: 'inventory',

    fields: [
        'name', 'description', 'price', 'numAvailable', 'category', 'itemId'
    ],

    data: { items: [
        {
            itemId: 1,
            name: 'French Roast',
            description: "Dark and deeply roasted blend perfect for a kick in the morning",
            numAvailable: 15,
            price: 12,
            category: 'beans'
        },
        {
            itemId: 2,
            name: 'Vanilla Blend',
            description: "Light and nutty coffee perfect as a complement to sweets",
            numAvailable: 10,
            price: 10,
            category: 'beans'
        },
        {
            itemId: 3,
            name: 'Hipster Mix',
            description: "Organic, gluten free, non-GMO, low carb, zero calorie, vegan," +
             "locally grown and naturally harvested coffee of the highest sort. ",
            numAvailable: 2,
            price: 60,
            category: 'beans'
        },
        {
            itemId: 4,
            name: 'The Waking Dead',
            description: "If it was any stronger it would be a regulated substance!",
            numAvailable: 30,
            price: 6,
            category: 'ground'
        },
        {
            itemId: 5,
            name: 'Decaf',
            description: "Because you for some reason want bitter black coffee without any kick?",
            numAvailable: 10,
            price: 5,
            category: 'ground'
        },
        {
            itemId: 6,
            name: 'Turkish Coffee',
            description: "Thick and extremely strong, best served in shots with cream",
            numAvailable: 2,
            price: 16,
            category: 'ground'
        },
        {
            itemId: 7,
            name: 'CoffeeShop Mug',
            description: "Show your love with your own unique CoffeeShop logo mug :)",
            numAvailable: 100,
            price: 15,
            category: 'cup'
        }
    ]},

    proxy: {
        type: 'memory',
        reader: {
            type: 'json',
            rootProperty: 'items'
        }
    }
});
