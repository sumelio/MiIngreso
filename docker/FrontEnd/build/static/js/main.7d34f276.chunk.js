(window.webpackJsonp=window.webpackJsonp||[]).push([[0],{38:function(e,t,a){e.exports=a(70)},68:function(e,t,a){},70:function(e,t,a){"use strict";a.r(t);var n=a(0),c=a.n(n),r=a(32),i=a.n(r),l=a(13),o=a.n(l),s=a(15),u=a(8),d=a(9),m=a(11),p=a(10),f=a(12),h=a(72),E=a(74),b=a(73),v=a(6),y=a(71),N=Object(v.b)(function(e){return{items:e.addedItems}})(function(e){return console.log("props",e),c.a.createElement("nav",{className:"nav-extended"},c.a.createElement("div",{className:"nav-wrapper"},c.a.createElement("a",{className:"brand-logo"},"Mi Ingreso"),c.a.createElement("ul",{id:"nav-mobile",className:"right hide-on-med-and-down"},c.a.createElement("li",null,c.a.createElement(y.a,{to:"/"},"Catalogo de Productos")),c.a.createElement("li",null,c.a.createElement(y.a,{to:"/cart"}," (",e.items.length,") MI carrito")))),c.a.createElement("span",{className:"hide-on-med-and-up show-on-medium collection"},c.a.createElement(y.a,{className:"collection-item",to:"/"},"Catalogo de Productos"),c.a.createElement(y.a,{className:"collection-item",to:"/cart"}," (",e.items.length,") MI carrito")))}),g=a(34),O=a.n(g),j=function(e){function t(){var e,a;Object(u.a)(this,t);for(var n=arguments.length,c=new Array(n),r=0;r<n;r++)c[r]=arguments[r];return(a=Object(m.a)(this,(e=Object(p.a)(t)).call.apply(e,[this].concat(c)))).handleClick=function(e){a.props.addToCart(e)},a}return Object(f.a)(t,e),Object(d.a)(t,[{key:"render",value:function(){var e=this,t=this.props.items&&this.props.items.map(function(t){return c.a.createElement("div",{className:"card",key:t.id},c.a.createElement("div",{className:"card-image"},c.a.createElement("img",{className:"image",src:t.img,alt:t.title}),c.a.createElement("span",{className:"card-title"},t.title),c.a.createElement("span",{to:"/",className:"btn-floating halfway-fab waves-effect waves-light red",onClick:function(){e.handleClick(t.id)}},c.a.createElement("i",{className:"material-icons"},"add"))),c.a.createElement("div",{className:"card-content"},c.a.createElement("p",null,t.desc),c.a.createElement("p",null,c.a.createElement("b",null,"Price: ",t.price,"$"))))});return c.a.createElement("div",{className:"container"},c.a.createElement("h3",{className:"center"},"Nuestros productos"),c.a.createElement("div",{className:"box"},t))}}]),t}(n.Component),I=Object(v.b)(function(e){return{items:e.items}},function(e){return{addToCart:function(t){e(function(e){return{type:"ADD_TO_CART",id:e}}(t))}}})(j),w=function(e){function t(){var e,a;Object(u.a)(this,t);for(var n=arguments.length,c=new Array(n),r=0;r<n;r++)c[r]=arguments[r];return(a=Object(m.a)(this,(e=Object(p.a)(t)).call.apply(e,[this].concat(c)))).handleChecked=function(e){e.target.checked?a.props.addShipping():a.props.substractShipping()},a}return Object(f.a)(t,e),Object(d.a)(t,[{key:"componentWillUnmount",value:function(){this.refs.shipping.checked&&this.props.substractShipping()}},{key:"render",value:function(){return c.a.createElement("div",{className:"container"},c.a.createElement("div",{className:"collection"},c.a.createElement("li",{className:"collection-item"},c.a.createElement("label",null,c.a.createElement("input",{type:"checkbox",ref:"shipping",onChange:this.handleChecked}),c.a.createElement("span",null,"Envio(+6$)"))),c.a.createElement("li",{className:"collection-item"},c.a.createElement("b",null,"Total: ",this.props.total," $"))),c.a.createElement("div",{className:"checkout"},c.a.createElement("button",{className:"waves-effect waves-light btn"},"Proceder con el pago")))}}]),t}(n.Component),k=Object(v.b)(function(e){return{addedItems:e.addedItems,total:e.total}},function(e){return{addShipping:function(){e({type:"ADD_SHIPPING"})},substractShipping:function(){e({type:"SUB_SHIPPING"})}}})(w),C=function(e){function t(){var e,a;Object(u.a)(this,t);for(var n=arguments.length,c=new Array(n),r=0;r<n;r++)c[r]=arguments[r];return(a=Object(m.a)(this,(e=Object(p.a)(t)).call.apply(e,[this].concat(c)))).handleRemove=function(e){a.props.removeItem(e)},a.handleAddQuantity=function(e){a.props.addQuantity(e)},a.handleSubtractQuantity=function(e){a.props.subtractQuantity(e)},a}return Object(f.a)(t,e),Object(d.a)(t,[{key:"render",value:function(){var e=this,t=this.props.items.length?this.props.items.map(function(t){return c.a.createElement("li",{className:"collection-item avatar",key:t.id},c.a.createElement("div",{className:"item-img"},c.a.createElement("img",{src:t.img,alt:t.img,className:""})),c.a.createElement("div",{className:"item-desc"},c.a.createElement("span",{className:"title"},t.title),c.a.createElement("p",null,t.desc),c.a.createElement("p",null,c.a.createElement("b",null,"Precio: ",t.price,"$")),c.a.createElement("p",null,c.a.createElement("b",null,"Cantidad: ",t.quantity)),c.a.createElement("div",{className:"add-remove"},c.a.createElement(y.a,{to:"/cart"},c.a.createElement("i",{className:"material-icons",onClick:function(){e.handleAddQuantity(t.id)}},"arrow_drop_up")),c.a.createElement(y.a,{to:"/cart"},c.a.createElement("i",{className:"material-icons",onClick:function(){e.handleSubtractQuantity(t.id)}},"arrow_drop_down"))),c.a.createElement("button",{className:"waves-effect waves-light btn pink remove",onClick:function(){e.handleRemove(t.id)}},"Quitar")))}):c.a.createElement("p",null,"Nada.");return c.a.createElement("div",{className:"container"},c.a.createElement("div",{className:"cart"},c.a.createElement("h5",null,"Tu tienes ordenes:"),c.a.createElement("ul",{className:"collection"},t)),c.a.createElement(k,null))}}]),t}(n.Component),T=Object(v.b)(function(e){return{items:e.addedItems}},function(e){return{removeItem:function(t){e(function(e){return{type:"REMOVE_ITEM",id:e}}(t))},addQuantity:function(t){e(function(e){return{type:"ADD_QUANTITY",id:e}}(t))},subtractQuantity:function(t){e(function(e){return{type:"SUB_QUANTITY",id:e}}(t))}}})(C),_=function(e){function t(){return Object(u.a)(this,t),Object(m.a)(this,Object(p.a)(t).apply(this,arguments))}return Object(f.a)(t,e),Object(d.a)(t,[{key:"componentDidMount",value:function(){var e=Object(s.a)(o.a.mark(function e(){return o.a.wrap(function(e){for(;;)switch(e.prev=e.next){case 0:this.props.getProducts();case 1:case"end":return e.stop()}},e,this)}));return function(){return e.apply(this,arguments)}}()},{key:"render",value:function(){return c.a.createElement(h.a,null,c.a.createElement("div",{className:"App"},c.a.createElement(N,null),c.a.createElement(E.a,null,c.a.createElement(b.a,{exact:!0,path:"/",component:I}),c.a.createElement(b.a,{path:"/cart",component:T}))))}}]),t}(n.Component),A={getProducts:function(){return function(){var e=Object(s.a)(o.a.mark(function e(t){var a;return o.a.wrap(function(e){for(;;)switch(e.prev=e.next){case 0:return e.prev=0,e.next=3,O()({method:"get",url:"http://localhost:8881/product",timeout:3e3,headers:{},data:{}});case 3:a=e.sent,console.log("response",a.data.data),t({type:"GET_PRODUCTS",payload:a.data.data}),e.next=11;break;case 8:e.prev=8,e.t0=e.catch(0),console.log("Houston we have a problem: ".concat(e.t0.message),e.t0);case 11:case"end":return e.stop()}},e,this,[[0,8]])}));return function(t){return e.apply(this,arguments)}}()}},P=Object(v.b)(function(e){return{items:e.addedItems}},A)(_),S=(a(68),a(37)),D=a(7),Q={items:[],addedItems:[],total:0},U=function(){var e=arguments.length>0&&void 0!==arguments[0]?arguments[0]:Q,t=arguments.length>1?arguments[1]:void 0;if("ADD_TO_CART"===t.type){var a=e.items.find(function(e){return e.id===t.id});if(e.addedItems.find(function(e){return t.id===e.id}))return a.quantity+=1,Object(D.a)({},e,{total:e.total+a.price});a.quantity=1;var n=e.total+a.price;return Object(D.a)({},e,{addedItems:Object(S.a)(e.addedItems).concat([a]),total:n})}if("REMOVE_ITEM"===t.type){var c=e.addedItems.find(function(e){return t.id===e.id}),r=e.addedItems.filter(function(e){return t.id!==e.id}),i=e.total-c.price*c.quantity;return console.log(c),Object(D.a)({},e,{addedItems:r,total:i})}if("ADD_QUANTITY"===t.type){var l=e.items.find(function(e){return e.id===t.id});l.quantity+=1;var o=e.total+l.price;return Object(D.a)({},e,{total:o})}if("SUB_QUANTITY"===t.type){var s=e.items.find(function(e){return e.id===t.id});if(1===s.quantity){var u=e.addedItems.filter(function(e){return e.id!==t.id}),d=e.total-s.price;return Object(D.a)({},e,{addedItems:u,total:d})}s.quantity-=1;var m=e.total-s.price;return Object(D.a)({},e,{total:m})}return"ADD_SHIPPING"===t.type?Object(D.a)({},e,{total:e.total+6}):"SUB_SHIPPING"===t.type?Object(D.a)({},e,{total:e.total-6}):"GET_PRODUCTS"===t.type?(console.log("action.payload",t.payload),Object(D.a)({},e,{items:t.payload})):e},x=a(14),M=a(36),R=Object(x.c)(U,{items:[],addedItems:[],total:0},Object(x.a)(M.a));i.a.render(c.a.createElement(v.a,{store:R},c.a.createElement(P,null)),document.getElementById("root"))}},[[38,2,1]]]);
//# sourceMappingURL=main.7d34f276.chunk.js.map