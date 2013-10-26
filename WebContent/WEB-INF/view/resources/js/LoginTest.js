Ext.Ajax.request({
    url : 'get',
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    params : { "test" : "testParam" },
    jsonData: {
        "username" : "admin",
        "emailId" : "admin@sivalabs.com"
    },
    success: function (response) {
        var jsonResp = Ext.util.JSON.decode(response.responseText);
        Ext.Msg.alert("Info","UserName from Server : "+jsonResp.username);
    },
    failure: function (response) {
        var jsonResp = Ext.util.JSON.decode(response.responseText);
        Ext.Msg.alert("Error",jsonResp.error);
    }
});