Ext.application({
    requires: ['Ext.container.Viewport'],
    name: 'AM',

    appFolder: 'app',
    launch: function() {
        Ext.QuickTips.init();



        /*Ext.create('Ext.container.Viewport', {
         layout: 'fit',
         items: [
         {
         xtype: 'panel',
         title: 'Users',
         html : 'List of users will go here'
         }
         ]
         });*/

        Ext.onReady(function () {
            var image = Ext.create('Ext.Img', {
                src: "resources/images/logo.jpg",
                renderTo: document.body,
                height:100,
                width:300,

            });
            var image = Ext.create('Ext.Img', {
                src: "resources/images/header_image.jpg",
                renderTo: document.body,
                height:100,
                width:700,

            });
            var tabs = Ext.create('Ext.tab.Panel', {
                width: '100%',
                renderTo: document.body,
                items: [{
                    title: 'CRM',

                },

                ]
            });
            var vinod = Ext.create('Ext.panel.Panel', {
                width: '100%',
                renderTo: document.body,
                items: [{
                    border: false,
                    html: '<br><h1 style="color:#D63030;font-style:italic">Welcome to Customer Relationship Manegment</h1>',
                },

                ]
            });
            var login_form = Ext.create('Ext.form.FormPanel',{

                renderTo: Ext.get('logindiv'),
                frame: true,
                title: 'Login',
                width: 300,

                title: 'Login',
                frame:true,
                width: 320,
                bodyPadding: 10,

                defaultType: 'textfield',
                defaults: {
                    anchor: '100%'
                },

                items: [
                    {
                        allowBlank: false,
                        fieldLabel: 'User ID',
                        name: 'username',
                        emptyText: 'user id'
                    },
                    {
                        allowBlank: false,
                        fieldLabel: 'Password',
                        name: 'password',
                        emptyText: 'password',
                        inputType: 'password'
                    },
                    {
                        xtype:'checkbox',
                        fieldLabel: 'Remember me',
                        name: 'remember'
                    }
                ],

                buttons: [
                    { text:'Register' ,

                        handler:function(){
                            location.href="registration.html";
                        }

                    },


                    {
                        text: 'Login',
                        handler: function() {
                            login_form.getForm().submit({
                                url:'login.do', standardSubmit: true, method: 'POST'
                            });
                        }
                    }
                ]

            });
        });
    }
});