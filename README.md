# CoffeeShop
A small example project using EXTJS 6 classic with Java EE 7 on top of a MySQL local database all in a TomEE
 container. This is a small e-comm applications for browsing and purchasing coffee. The current version does not account
 for security or for a clustered environment. This is simply an example project to show business logic and front end
 design.

To host this project deploy the java resources as a .war file to any Java EE compliant container.
This project was developed on TomEE and has not been tested in other environments. Alternatively index.html can be
opened in firefox to view a preview of the front end.

Note: This application is developed using Sencha EXTJS 6.0.1 GPL version and as such is freely available to anyone
who wants to modify it from this repository. Web application infrastructure was created using Intellij IDEA Ultimate
edition trial version.

Application business rules:
1) The store contains products, which have a name, picture, category, quantity, and price.
2) A user has a shopping cart to which they add/remove products. They also can check out to "buy" their products
    -products can only be added if there are any available
    -availability does not decrease until user checks out
    -if product is no longer available at checkout, inform user that item can't be purchased
3) A user can only view products, they cannot edit them
4) A user must register with a name and password before they can get their shopping cart and buy items.

--To do
Add admins who can add/edit/delete products
Give admins financial breakdown on store performance (who bought what and when)
Security using Role Based Authorization
Hook front end to back end