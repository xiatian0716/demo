CSS 世界的诞生就是为图文信息展示服务的。在 CSS 世界中，HTML 是魔法石，选择器就是选择法器，CSS 属性就是魔法师，CSS 各种属性值就是魔法师的魔法技能，浏览器就是他们所在的“王国”。



##### 流：物理规律

- `流`：“流”是 CSS 世界中引导元素排列和定位的一条看不见的“水流”。“流体布局”，指的是利用元素“流”的特性实现的各类布局效果，以“流体布局”往往都是具有自适应性的。

- `魔法石`： HTML 元素分为“块级元素”和“内联元素”。常见的块级元素有div、p、li和table等，常见的内联元素为span、img、strong和em等。块级元素就负责结构，内联元素就负责内容。“元素”包含 4 个盒子，它们分别是 content box、padding box、border box 和 margin box。

- `特殊魔法石`：“附加盒子”，所有的“块级元素”都有一个“主块级盒子”，有些魔法石除此之外还有一个“附加盒子”。比如display: inline-block 元素穿着 inline 的皮藏着 block 的心。元素有两个盒子，外在盒子和内在盒子。外在盒子负责元素是可以一行显示，还是只能换行显示；内在盒子负责宽高、内容呈现什么的。“内在盒子”又叫“容器盒子”。根据“外在盒子”是内联还是块级我们可以把元素分为内联元素和块级元素。

  

##### 截流：使用原则

- `鑫三无准则`：即“无宽度，无图片，无浮动”。

- `宽度分离原则`：就是 CSS 中的 width 属性不与影响宽度的 padding/border（有时候包括 margin）属性共存，也就是不能出现以下的组合：.box { width: 100px; padding: 20px; } 。应当分离width 独立占用一层标签，而padding、border、margin 利用流动性在内部自适应呈现。.father {  width: 180px; } .son {  margin: 0 20px;  padding: 20px;  border: 1px solid; } 。box-sizing 被直译为“盒尺寸”，其更准确的叫法应该是“width 作用的细节”。默认情况下，width是作用在 content box 上的。

  

##### X状态：内联元素

- `内联模型`：{包含p[行框 (内联盒子内联盒子) 盒子]/p盒子}。

- `替换元素`：通过修改某个属性值呈现的内容就可以被替换的元素就称为“替换元素”。因此，img、object、video、iframe或者表单元素textarea和input都是典型的替换元素。替换元素和非替换元素之间只隔了一个content属性。

  

- `幽灵空白节点`：是内联盒模型中非常重要的一个概念，内联元素的所有解析和渲染表现就如同每个行框盒子的前面有一个“空白节点”一样。“幽灵空白节点”实际上也是一个盒子，不过是个假想盒，名叫“strut”，中文直译为“支柱”，是一个存在于每个“行框盒子”前面，同时具有该元素的字体和行高属性的 0 宽度的内联盒。

- `字母 x`：字母 x 的下边缘（线）就是我们的基线。x-height，指的是字母 x 的高度。

- `行高`：line-height 行高的定义就是两基线的间距，无论内联元素 line-height 如何设置，最终父级元素的高度都是由数值大的那个 line-height 决定的，我称之为“内联元素 line-height 的大值特性”。那是因为在内联盒模型中，存在一些你看不到的东西——“幽灵空白节点”。

- `垂直对齐`：vertical-align: text-top，盒子的顶部和父级内容区域的顶部对齐 ；vertical-align: text-bottom：盒子的底部和父级内容区域的底部对齐。vertical-align: middle middle 指的是基线往上 1/2 x-height 高度。vertical-align 的默认值就是基线。

  

##### 水中取物：流的破坏与保护

- `父元素塌陷`：float用于文字环绕 特性 父元素包裹，块状化(display: block)，核心-破坏文档流让父元素的高度塌陷，没有任何 margin 合并。clear 属性，处理 float 属性带来的高度塌陷等问题，clear 属性对“后面的”浮动元素是不闻不问的。

- ` 指绝对定位`：absolute 即将对象从文档流中拖出，使用left、right、top、bottom等属性进行绝对定位，也兼具“破坏性”“包裹性”“块状化”等特性。absolute 与 overflow——如果 overflow 属性所在的元素同时也包含relative元素，里面的绝对定位元素会被剪裁；如果 overflow 元素和绝对定位元素之间有relative元素，也会被剪裁。absolute 与 clip——剪裁“最佳可访问性隐藏”。

- `世界的结界`：具有 BFC 特性的元素的子元素不会受外部元素影响，也不会影响外部元素。普通流体元素在设置了 overflow: hidden 后，会自动填满容器中除了浮动元素以外的剩余空间，形成自适应布局效果。滚动条overflow-x 和 overflow-y。

  

##### 弹性布局

- `display`：声明display: flex 或 display: inline-flex声明，弹性布局就会被创建。

  

- `flex line`：在 flex 容器中，item 以线来显示，被认为是「flex line」。其值依据 `flex-direction` 值的变化，有时候是 `row`，而有时候是 `column`。

- ` flex-direction`：属性用来控制flex子项整体布局方向，决定是从左往右排列还是从右往左排列，是从上往下排列还是从下往上排列。

- ` flex-wrap`：属性用来控制flex子项是单行显示还是换行显示，以及在换行情况下，每一行内容是否在垂直方向的反方向显示。

- ` flex-flow`：属性是flex-direction属性和flex-wrap属性的缩写，表示弹性布局的流动特性。

  

- ` 对齐特性`：justify-content(水平)、align-items(垂直)和align-content(作用在flex子项横轴)，以及align-self(作用在flex子项纵轴)。

- `justify-content` ：只会对主轴（main axis）产生影响，剩下的三个 `align-*` 只会在 cross 上产生影响。

- `align-item` ：属性需要施加在 flex 容器上，它规定的是 flex 容器中 item 在交叉轴中的对齐方式；`align-self` 属性则施加在 flex 容器中的 item 上，覆盖了外部容器规定的 `align-items` 属性，同样也只规定在交叉轴上的对齐方式。

- `align-content` ：属性的作用会比 `align-items` 和 `align-self` 更加复杂一些。对比 `align-items` 和 `align-self` 直接移动 item 自身在交叉轴上的基线，`align-content` 移动的是容器自身的 `flex line`。
