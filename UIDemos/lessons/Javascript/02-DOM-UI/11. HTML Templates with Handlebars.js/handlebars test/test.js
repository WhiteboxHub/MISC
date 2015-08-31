(function() {
    var templateNode = document.getElementById('template'),
        templateStr = templateNode.innerHTML;

    var template = Handlebars.compile(templateStr);

    var articles = [{
        id: 1,
        title: 'Some title 1',
        content: 'Some content 1',
        postDate: '12.01.2014'
    }, {
        id: 2,
        title: 'Some title 2',
        content: 'Some content 2'
    }, {
        id: 3,
        title: 'Some title 3',
        content: 'Some content 3'
    }];

    var articleHTML = template({
        articles: articles // []
    });
    document.body.innerHTML += articleHTML;


}());
