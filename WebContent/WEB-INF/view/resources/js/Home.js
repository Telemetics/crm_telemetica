
Ext.require([
    'Ext.panel.*',
    'Ext.toolbar.*',
    'Ext.button.*',
    'Ext.container.ButtonGroup',
    'Ext.layout.container.Table'
]);
Ext.application({
    requires: ['Ext.container.Viewport'],
    name: 'AM',

    appFolder: 'app',
    launch: function() {
        Ext.QuickTips.init();




        var image = Ext.create('Ext.Img', {
            src: "../resources/images/logo.jpg",
            renderTo: document.body,
            height:100,
            width:300

        });
        var image = Ext.create('Ext.Img', {
            src: "../resources/images/header_image.jpg",
            renderTo: document.body,
            height:100,
            width:700

        });

        Ext.create('Ext.toolbar.Toolbar', {
            renderTo: document.body,
            width   : '100%',
            items: [
                {
                    xtype: 'button', // default for Toolbars
                    text: 'Home'
                },
                {
                    xtype: 'splitbutton',
                    text : 'Account',
                    menu: [
                        {
                            text: 'Add Account'
                        },
                        {
                            text: 'Modify Account'
                        }
                    ]

                },
                {
                    xtype: 'splitbutton',
                    text : 'MOM',
                    menu: [
                        {
                            text: 'Add MOM'
                        }

                    ]
                },
                {
                    xtype: 'splitbutton',
                    text : 'Opportunity',
                    menu: [
                        {
                            text: 'Add Opportunity'

                        },
                        {
                            text: 'Modify Opportunity'
                        }
                    ]
                },
                {
                    xtype: 'button',
                    text : 'Request Action'


                },
                {
                    xtype: 'button',
                    text : 'MIS'


                },
                {
                    xtype: 'button',
                    text : 'View Account'


                },
                // begin using the right-justified button container
                {xtype: 'tbspacer',

                    width: 100},
                {
                    xtype    : 'textfield',
                    id : 'ttt',
                    name     : 'field1',
                    emptyText: 'enter search term'
                },


                // add a 50px space
                {
                    xtype: 'panel',
                    html:'<a href="index.html">Logout</a>'
                }
            ]

        });
        Ext.Ajax.request({
            url : 'resources/call.txt',
            method: 'GET',
            headers: { 'Content-Type': 'application/json' },
            params : { "test" : "testParam" },

            success: function (response) {
                var jsonResp = Ext.JSON.decode(response.responseText);
                alert("UserName : "+jsonResp.username);
            },
            failure: function (response) {
                var jsonResp = Ext.JSON.decode(response.responseText);
                alert("Error"+jsonResp.error);
            }
        });


    }
});