# HTML-Student
前端学习网站
# ***HTML***

1. ## ==**css样式布局**==：

    ​	大致分为三种。  内部样式：写到内部style中。外部样式：提取到外部css样式中。内联样式：写到标签内部。权重：近距离优先，哪个离得近听哪个。

2. ## ==**盒子模型**==：

    ​		对于一个块元素来说具备宽高，边框，外边距，内填充这几个属性。它的实际占用空间也是基于这几个元素来确定的。除了盒子模型外，默认的块内元素有些会自带padding和margin，所以我们一般会在一开始把他们清除。

    ## 3.==css浮动**==打破常规文件流，让块标签实现横向显示，在css中我们用float属性实现元素的浮动。

    ## 4.**==css定位==**：

    ​		一般可以分为四种：绝对定位、相对定位、固定定位、粘性定位  一般情况下会结合绝对定位和相对定位的综合特点来进行子绝父相（子元素定义绝对  父元素定位相对）  **绝对定位**：可以让元素在页面当中定位，参照物是基于父容器的，如果父容器有定位属性，则根据父容器来定位，如果没有就会向上找祖容器如果都没有则基于浏览器定位。  **相对定位**：可以根据自己原本的位置进行定位当元素位移以后原本的位置无法添加其他内容。  **固定定位**：基于浏览器定位。  粘性定位：结合了固定定位和相对定位的特点，**粘性定位**：的位置也是无法放置其他内容同时又是基于浏览器的。  ![img](file:///C:/Users/20424/AppData/Local/Temp/msohtmlclip1/01/clip_image004.png)  

    ## ==动态数据高度的塌陷问题的解决方法==——万能清除法

    通过添加伪元素来解决。本方法结合了先前多种的方法，针对多种方法的缺点进行了修改，(div的大小通过内容来撑大)具体代码如下：

    ```php+HTML
    .clear_fix::after{
            content: "";  
    	display: block;
            height: 0;
         overflow: hidden;
            visibility: hidden;/*visibility 属性规定元素是否可见。提示：即使不可见的元素也会占据页面上的空间。请使用 "display" 属性来创建不占据页面空间的不可见元素。*/
         clear: both;
         }  
    ```

## 扩展

内联元素转为块级元素

- 绝对定位
- 浮动
- display

垂直居中的方法

- 定位

    - 方法一

        ```css
          #small{
                        width: 50px;
                        height: 50px;
                        background: #bbbbbe;
                        position: absolute;
                        top: 50%;
                        left: 50%;
              			margin-top:-25px;
              			margin-left:-25px;
                    }
        ```

    - 方法二

        ```css
          #small{
                        width: 50px;
                        height: 50px;
                        background: #bbbbbe;
                        position: absolute;
                        top:0;left:0;
              			bottom:0;right:0;
              			margin:auto;
                    }
        ```

        

- 位移

    宽高可以不设置

    ```css
     #small{
                    /*width: 50px;
                    height: 50px;*/
                    background: #bbbbbe;
                    position: absolute;
                    top: 50%;
                    left: 50%;
                    transform: translate(-50%,-50%);
                    /*百分数参考的是当前盒子的宽高 */
                }
    ```

- 弹性盒布局

    ```css
     body{
                    display: flex;
                    justify-content: center;
                    align-items: center;
                }
                div{
                    width: 500px;
                    height: 500px;
                    border: 1px solid pink;
                }
    ```

    

## 6.==选择器，==

如 ① **nth-child(n)**:可以选择父元素下的第n个元素；

②**:target:**为页面的某个target元素（该元素的id被当作页面中的超链接来使用）指定样式。只有当点击了元素后，：target元素设置的样式才会起作用。

③**：after**：用于再某个元素后面插入一些内容。 

```
  .ImageShow img:nth-child(1):target{<!--img：表示选择的标签类型-->
       left: 0;
          opacity: 1;
     }
```

##    7.今天的第二个板块——2D转换

​        我们学习了CSS3的2D转换，2D转换，分为translate(移动)、scale（缩放）、rotate（旋转）以及skew（倾斜）。具体解释如下所示：

   ①==translate(移动)==：在属性后带上X或Y表示在X轴或Y轴上位移，为X时，数值为正，向右移动。为Y时，数值为正，向下移动。如：

   transform: translate(-100px,200px);

   ②==scale（缩放）==：正数表示扩大；负数表示先翻转，再放大（第二个参数省略，则第二个参考第一个）；小于1，可以缩小。如：

   transform: scale(-0.2,-0.3);

   ③==rotate（旋转）==：在属性后带上X表示绕X轴旋转，不带绕原点旋转，如：

   transform: rotate(360deg);

   ④==skew（倾斜）==：带上X表示绕X轴倾斜，不带绕原点倾斜。第二个参数默认为0。如：

   transform: skew(30deg,40deg);

   ![](C:\Users\20424\AppData\Roaming\Typora\typora-user-images\image-20200722223408298.png)

##    8.今天的第三个板块，3D模块

​		我们学习了关于CSS3D的相应知识点，3D模块的效果与2D的效果相差不了多少，无外乎是多了一个Z轴，Z轴在视觉上就是从屏幕指向自己。

     接下的内容针对动画效果进行了案例练习，在这个案例中，给我们讲述了3D开发，主要在3D空间内开发如：transform-style: preserve-3d，此案例实现了在空间内出现一个空间立体几何。
    
     本案例，主要是实现了一个立体几何，在立体几何内存在一张照片。

   ![](C:\Users\20424\AppData\Roaming\Typora\typora-user-images\image-20200722223429323.png)



##    9.==阴影==：box-shdow:

   - `inset`: 默认阴影在边框外。使用 inset 后，阴影在边框内（即使是透明边框），背景之上内容之下。也有些人喜欢把这个值放在最后，浏览器也支持。

- `<offset-x> <offset-y>`: 这是头两个 `<length>`值，用来设置阴影偏移量。`<offset-x>` 设置水平偏移量，如果是负值则阴影位于元素左边。 `<offset-y>` 设置垂直偏移量，如果是负值则阴影位于元素上面。可用单位请查看 `<length>`。如果两者都是0，那么阴影位于元素后面。这时如果设置了 `<blur-radius>` 或 `<spread-radius>` 则有模糊效果。

    - `<blur-radius>`: 这是第三个 `<length>` 值。值越大，模糊面积越大，阴影就越大越淡。 不能为负值。默认为0，此时阴影边缘锐利。

- `<spread-radius>` : 这是第四个 `<length>` 值。取正值时，阴影扩大；取负值时，阴影收缩。默认为0，此时阴影与元素同样大。(*==阴影的尺寸*==)

    - `<color>` : 相关事项查看 `<color>` 。如果没有指定，则由浏览器决定——通常是color的值，不过目前Safari取透明。

        ![](C:\Users\20424\Desktop\box-shadow-diagram.png)

## 10.==动画==：

​		在CSS3D中，@keyframs规则用于创建动画。在@keyframs中规定某项CSS样式，就能创建出由当前样式逐渐变为新样式的动画效果。

​	同时CSS3中，使用 animation属性，可以定义复杂的动画，animation的综合设置时各属性字段的含义如下所示：动画名称、完成动画所需的时间、速度曲线、执行动画之前的延迟、播放次数、是否逆向交替。

animation：(name、time、v、延迟、number、交替)

```
`img:nth-child(1){
              animation:img1 90s linear infinite ;
           }
           /* 缩放效果 */
           @keyframes img1{
              0%{
                  transform: scale(1);
              }
              50%{
                  transform: scale(2);
              }
              100%{
                  transform: scale(1);
              }
           }：
```




![](C:\Users\20424\AppData\Roaming\Typora\typora-user-images\image-20200723212316274.png)

## 11.背景图片

background:颜色（background-color）、图像（background-image）、透明度（rgba、opacity）、背景图像平铺（background-repeat）、位置（background-position）、大小（background-size）、显示区域（background-origin）、裁剪区域（background-clip）

| 值                                                           | 说明                                             | CSS  |
| :----------------------------------------------------------- | :----------------------------------------------- | :--- |
| *[background-color](https://www.runoob.com/cssref/pr-background-color.html)* | 指定要使用的背景颜色                             | 1    |
| *[background-position](https://www.runoob.com/cssref/pr-background-position.html)* | 指定背景图像的位置                               | 1    |
| *[background-size](https://www.runoob.com/cssref/css3-pr-background-size.html)* | 指定背景图片的大小                               | 3    |
| *[background-repeat](https://www.runoob.com/cssref/pr-background-repeat.html)* | 指定如何重复背景图像                             | 1    |
| *[background-origin](https://www.runoob.com/cssref/css3-pr-background-origin.html)* | 指定背景图像的定位区域                           | 3    |
| *[background-clip](https://www.runoob.com/cssref/css3-pr-background-clip.html)* | 指定背景图像的绘画区域                           | 3    |
| *[background-attachment](https://www.runoob.com/cssref/pr-background-attachment.html)* | 设置背景图像是否固定或者随着页面的其余部分滚动。 | 1    |
| *[background-image](https://www.runoob.com/cssref/pr-background-image.html)* | 指定要使用的一个或多个背景图像                   |      |

## 12.选择器、

选择器总表

| 选择器                                                       | 示例                  | 示例说明                                                  | CSS  |
| :----------------------------------------------------------- | :-------------------- | :-------------------------------------------------------- | :--- |
| [.*class*](https://www.runoob.com/cssref/sel-class.html)     | .intro                | 选择所有class="intro"的元素                               | 1    |
| [#*id*](https://www.runoob.com/cssref/sel-id.html)           | #firstname            | 选择所有id="firstname"的元素                              | 1    |
| [*](https://www.runoob.com/cssref/sel-all.html)              | *                     | 选择所有元素                                              | 2    |
| *[element](https://www.runoob.com/cssref/sel-element.html)*  | p                     | 选择所有<p>元素                                           | 1    |
| *[element,element](https://www.runoob.com/cssref/sel-element-comma.html)* | div,p                 | 选择所有<div>元素和<p>元素                                | 1    |
| [*element* *element*](https://www.runoob.com/cssref/sel-element-element.html) | div p                 | 选择<div>元素内的所有<p>元素                              | 1    |
| [*element*>*element*](https://www.runoob.com/cssref/sel-element-gt.html) | div>p                 | 选择所有父级是 <div> 元素的 <p> 元素                      | 2    |
| [*element*+*element*](https://www.runoob.com/cssref/sel-element-pluss.html) | div+p                 | 选择所有紧接着<div>元素之后的<p>元素                      | 2    |
| [[*attribute*\]](https://www.runoob.com/cssref/sel-attribute.html) | [target]              | 选择所有带有target属性元素                                | 2    |
| [[*attribute*=*value*\]](https://www.runoob.com/cssref/sel-attribute-value.html) | [target=-blank]       | 选择所有使用target="-blank"的元素                         | 2    |
| [[*attribute*~=*value*\]](https://www.runoob.com/cssref/sel-attribute-value-contains.html) | [title~=flower]       | 选择标题属性包含单词"flower"的所有元素                    | 2    |
| [[*attribute*\|=*language*\]](https://www.runoob.com/cssref/sel-attribute-value-lang.html) | [lang\|=en]           | 选择 lang 属性以 en 为开头的所有元素                      | 2    |
| [:link](https://www.runoob.com/cssref/sel-link.html)         | a:link                | 选择所有未访问链接                                        | 1    |
| [:visited](https://www.runoob.com/cssref/sel-visited.html)   | a:visited             | 选择所有访问过的链接                                      | 1    |
| [:active](https://www.runoob.com/cssref/sel-active.html)     | a:active              | 选择活动链接                                              | 1    |
| [:hover](https://www.runoob.com/cssref/sel-hover.html)       | a:hover               | 选择鼠标在链接上面时                                      | 1    |
| [:focus](https://www.runoob.com/cssref/sel-focus.html)       | input:focus           | 选择具有焦点的输入元素                                    | 2    |
| [:first-letter](https://www.runoob.com/cssref/sel-firstletter.html) | p:first-letter        | 选择每一个<p>元素的第一个字母                             | 1    |
| [:first-line](https://www.runoob.com/cssref/sel-firstline.html) | p:first-line          | 选择每一个<p>元素的第一行                                 | 1    |
| [:first-child](https://www.runoob.com/cssref/sel-firstchild.html) | p:first-child         | 指定只有当<p>元素是其父级的第一个子级的样式。             | 2    |
| [:before](https://www.runoob.com/cssref/sel-before.html)     | p:before              | 在每个<p>元素之前插入内容                                 | 2    |
| [:after](https://www.runoob.com/cssref/sel-after.html)       | p:after               | 在每个<p>元素之后插入内容                                 | 2    |
| [:lang(*language*)](https://www.runoob.com/cssref/sel-lang.html) | p:lang(it)            | 选择一个lang属性的起始值="it"的所有<p>元素                | 2    |
| [*element1*~*element2*](https://www.runoob.com/cssref/sel-gen-sibling.html) | p~ul                  | 选择p元素之后的每一个ul元素                               | 3    |
| [[*attribute*^=*value*\]](https://www.runoob.com/cssref/sel-attr-begin.html) | a[src^="https"]       | 选择每一个src属性的值以"https"开头的元素                  | 3    |
| [[*attribute*$=*value*\]](https://www.runoob.com/cssref/sel-attr-end.html) | a[src$=".pdf"]        | 选择每一个src属性的值以".pdf"结尾的元素                   | 3    |
| [[*attribute**=*value*\]](https://www.runoob.com/cssref/sel-attr-contain.html) | a[src*="runoob"]      | 选择每一个src属性的值包含子字符串"runoob"的元素           | 3    |
| [:first-of-type](https://www.runoob.com/cssref/sel-first-of-type.html) | p:first-of-type       | 选择每个p元素是其父级的第一个p元素                        | 3    |
| [:last-of-type](https://www.runoob.com/cssref/sel-last-of-type.html) | p:last-of-type        | 选择每个p元素是其父级的最后一个p元素                      | 3    |
| [:only-of-type](https://www.runoob.com/cssref/sel-only-of-type.html) | p:only-of-type        | 选择每个p元素是其父级的唯一p元素                          | 3    |
| [:only-child](https://www.runoob.com/cssref/sel-only-child.html) | p:only-child          | 选择每个p元素是其父级的唯一子元素                         | 3    |
| [:nth-child(*n*)](https://www.runoob.com/cssref/sel-nth-child.html) | p:nth-child(2)        | 选择每个p元素是其父级的第二个子元素                       | 3    |
| [:nth-last-child(*n*)](https://www.runoob.com/cssref/sel-nth-last-child.html) | p:nth-last-child(2)   | 选择每个p元素的是其父级的第二个子元素，从最后一个子项计数 | 3    |
| [:nth-of-type(*n*)](https://www.runoob.com/cssref/sel-nth-of-type.html) | p:nth-of-type(2)      | 选择每个p元素是其父级的第二个p元素                        | 3    |
| [:nth-last-of-type(*n*)](https://www.runoob.com/cssref/sel-nth-last-of-type.html) | p:nth-last-of-type(2) | 选择每个p元素的是其父级的第二个p元素，从最后一个子项计数  | 3    |
| [:last-child](https://www.runoob.com/cssref/sel-last-child.html) | p:last-child          | 选择每个p元素是其父级的最后一个子级。                     | 3    |
| [:root](https://www.runoob.com/cssref/sel-root.html)         | :root                 | 选择文档的根元素                                          | 3    |
| [:empty](https://www.runoob.com/cssref/sel-empty.html)       | p:empty               | 选择每个没有任何子级的p元素（包括文本节点）               | 3    |
| [:target](https://www.runoob.com/cssref/sel-target.html)     | #news:target          | 选择当前活动的#news元素（包含该锚名称的点击的URL）        | 3    |
| [:enabled](https://www.runoob.com/cssref/sel-enabled.html)   | input:enabled         | 选择每一个已启用的输入元素                                | 3    |
| [:disabled](https://www.runoob.com/cssref/sel-disabled.html) | input:disabled        | 选择每一个禁用的输入元素                                  | 3    |
| [:checked](https://www.runoob.com/cssref/sel-checked.html)   | input:checked         | 选择每个选中的输入元素                                    | 3    |
| [:not(*selector*)](https://www.runoob.com/cssref/sel-not.html) | :not(p)               | 选择每个并非p元素的元素                                   | 3    |
| [::selection](https://www.runoob.com/cssref/sel-selection.html) | ::selection           | 匹配元素中被用户选中或处于高亮状态的部分                  | 3    |
| [:out-of-range](https://www.runoob.com/cssref/sel-out-of-range.html) | :out-of-range         | 匹配值在指定区间之外的input元素                           | 3    |
| [:in-range](https://www.runoob.com/cssref/sel-in-range.html) | :in-range             | 匹配值在指定区间之内的input元素                           | 3    |
| [:read-write](https://www.runoob.com/cssref/sel-read-write.html) | :read-write           | 用于匹配可读及可写的元素                                  | 3    |
| [:read-only](https://www.runoob.com/cssref/sel-read-only.html) | :read-only            | 用于匹配设置 "readonly"（只读） 属性的元素                | 3    |
| [:optional](https://www.runoob.com/cssref/sel-optional.html) | :optional             | 用于匹配可选的输入元素                                    | 3    |
| [:required](https://www.runoob.com/cssref/sel-required.html) | :required             | 用于匹配设置了 "required" 属性的元素                      | 3    |
| [:valid](https://www.runoob.com/cssref/sel-valid.html)       | :valid                | 用于匹配输入值为合法的元素                                | 3    |
| [:invalid](https://www.runoob.com/cssref/sel-invalid.html)   | :invalid              | 用于匹配输入值为非法的元素                                | 3    |

### nth-child

选择器匹配父元素中的==第 n 个子元素==，元素类型没有限制。选择每个元素是其父级的第n个子元素,当类型与个数均匹配的情况下，才产生效果

```html
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8"> 
<title>菜鸟教程(runoob.com)</title> 
<style> 
p:nth-child(2)
{
	background:#ff0000;
}
</style>
</head>
<body>

<h1>This is a heading</h1>
<p>The first paragraph.</p>
<p>The second paragraph.</p>
<p>The third paragraph.</p>

<p><b>注意:</b> Internet Explorer 8 and以及更早版本的浏览器 :nth-child()选择器.</p>

</body>
</html>
```

### :nth-of-type(n)

:nth-of-type(n)选择器匹配同类型中的第n个同级兄弟元素。

```html
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8"> 
<title>菜鸟教程(runoob.com)</title> 
<style> 
p:nth-of-type(2)
{
	background:#ff0000;
}
</style>
</head>
<body>

<h1>This is a heading</h1>
<p>The first paragraph.</p>
<p>The second paragraph.</p>
<p>The third paragraph.</p>
<p>The fourth paragraph.</p>

</body>
</html>
```

## 13.宽高自适应

####     	宽度自适应，参考自父元素；

1. 宽度不设置——有内容撑开（auto）
2. 设置百分比 ，参考自父元素
3. 最大宽度(max-width)和最小宽度(min-width)   

####        高度自适应，参考自父元素；

> 1. auto 自动 根据内容撑开
> 2. 高度不设置 根据内容撑开
> 3. 百分比 参考父元素
> 4. 最小高度(min-height)和最大高度(max-height)
> 5. 一屏页面(盒子的宽高和当前浏览器的宽高一样)的实现方式

##### 应用

###### 一：一屏展开

解释：当需要内容水平和垂直实现，按照屏幕大小展开的时候（盒子高度和当前浏览器的高度一致）

```css
  html,body{
    height:100%;
  }
  div{
    height:100%;
    width:100%; (可设，可不设)
  }

```

###### 二、==高度塌陷==

产生条件：

> 1. 父元素不设置高度
> 2. 子元素浮动，脱离文档流，无法撑开父元素

解决方法（不适用于由于定位而产生的塌陷）：

1. 给父元素添加overflow:hidden;(会触发BFC)

    弊端：会把溢出父元素的内容隐藏掉

    ![image-20201010114119452](C:\Users\20424\AppData\Roaming\Typora\typora-user-images\image-20201010114119452.png)

2. 给浮动元素的下发添加一个块级元素，给块级元素设置clear属性

    > 2.1	clear:（left/right/both），clear清除浮动元素对其带来的影响,clear只对块级元素产生影响；
    >
    > 2.2    clear只对块级元素产生影响

​      弊端：多个块级元素会造成代码的冗余

 3.万能清除法

1. 给高度塌陷的父元素，通过**伪元素**选择器的方法添加元素  
        ```css
          高度塌陷的父元素::after{
            content:"";
            clear:both;
            display:block;/*after所添加的元素是内联元素，所以转换为块级元素*/
          }
        ```

## 14.解决页面进入便产生过度效果

在页面最后插入

```javascript
<script>
    ;
</script>
```

## 15.利用外部样式表写过渡属性存在的问题及解决

  * 问题：利用外部样式表写过渡属性可能会在页面初始的时候就有过渡效果
  * 解决：给整个结构也就是html的标签下面添加 <script>;</script>

## 16.过渡属性对 display:none到display:block是不生效的  

使用透明度

## 17.怪异盒模型

> box-sizing  ie8及以上

| 值          | 说明                                                         |
| :---------- | :----------------------------------------------------------- |
| content-box | 标准盒模型的宽度=内容区的width+padding的左右值+border的左右值+margin的左右值 |
| border-box  | 指定宽度和高度（最小/最大属性）确定元素边框。也就是说，对元素指定宽度和高度包括了 padding 和 border 。通过从已设定的宽度和高度分别减去边框和内边距才能得到内容的宽度和高度。 ==怪异盒模型的宽度=内容区的widthmargin的左右值== |
| inherit     | 指定 box-sizing 属性的值，应该从父元素继承                   |

## 18.弹性盒布局

### 什么是弹性盒模型布局

#### 简介：

弹性盒模型布局是CSS3中一种新的布局方式，它的优势在于：开发只需声明布局应该具有的行为，而不需要给出具体的实现方式，它的目的是提供一种更加高效的方式来对容器中的条目进行布局、对齐和分配空间.

即使容器中的条目的尺寸是未知或是动态的，弹性盒模型也能正常地工作，容器会根据布局的需要，调整条目的尺寸和顺序来填充空间，==当容器的屏幕尺寸变大或变小时，容器中条目的尺寸或顺序也会动态地调整：当容器尺寸变大时，条目会被拉大来更好地填充空间，相对地，当容器的尺寸变小时，条目的尺寸和顺序也会相应的变小，防止条目溢出容器==。

与传统布局不同的是，弹性盒模型布局与方向是无关的，传统布局中，block布局是把块在垂直方向从上到下排列的，在inline布局中，是把元素在水平方向上排列的，而在弹性盒模型中，方向是由开发人员控制。

### 相关概念：

#### ![img](https://img-blog.csdn.net/20170221221037515)



如上图所示：边框表示容器，"1"和"2"表示条目，弹性盒模型中，有两条相互垂直的轴，水平方向上（X）的表示主轴，垂直方向上（Y）的表示交叉轴，当然，主轴也可以在垂直方向上，交叉轴可以在水平方向上。

在布局中，CSS属性首先要定义主轴的方向（水平或垂直），交叉轴也相应地确定下来，主轴表示容器中每一行上条目的排列顺序，交叉轴表示条目本身的排列顺序。

确定了主轴和交叉轴，还要确定各自的排列顺序，水平方向上，可以从左到右或从右到左，在垂直方向上，可以从上到下或从下到上。在主轴上，条目的起始和结束位置，分别为主轴的起始和主轴的结束，在交叉轴上，条目的起始和结束位置，分别为交叉轴的起始和交叉轴的结束。

弹性盒模型的两个尺寸：主轴尺寸和交叉轴尺寸。如果主轴在水平方向上，主轴尺寸和交叉轴尺寸分别为元素的宽度和长度，如果主轴在垂直方向上，尺寸相反。若主轴在水平上，与主轴和交叉尺寸对应的属性分别CSS属性中的widht和height。

### 弹性盒模型相关的属性

> flex-direction：主轴的方向（即项目的排列方向）
>         flex-wrap：如果一条轴线排不下，如何换行
> 		flex-flow：flex-direction属性和flex-wrap属性的简写
> 		justify-content：定义了项目在主轴上的对齐方式
> 		align-items：定义项目在交叉轴上如何对齐
> 		align-content：多根轴线的对齐方式，一根轴该属性无效

#### （1） flex-direction属性

```
flex-direction属性可以改变主轴的方向
```

> flex-direction: row | row-reverse | column | column-reverse

![](https://img-blog.csdn.net/20180202093908095?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQveXVzaHVhbmd5dXNodWFuZw==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

可能取值有四个

> row(默认值) : 	主轴为水平方向，七点在左边
>
> row-reverse:  	主轴为水平方向，起点在右边
>
> column:			  主轴在垂直方向，起点在上边
>
> column-reverse:主轴在垂直方向，起点在下边

####   (2) flex-wrap属性

```
默认情况下，项目都排在一条线（又称”轴线”）上。flex-wrap属性定义，如果一条轴线排不下，如何  
换行。  
12
```

![这里写图片描述](https://img-blog.csdn.net/20180202094251785?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQveXVzaHVhbmd5dXNodWFuZw==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

```
.box{
  flex-wrap: nowrap | wrap | wrap-reverse;
}
```

####   (3)flex-flow

```
flex-flow属性是flex-direction属性和flex-wrap属性的简写形式，默认值为row nowrap。
1
.box {
  flex-flow: <flex-direction> || <flex-wrap>;
}
```

#### （4） justify-content属性

跟随主轴的方向进行变化

```
justify-content属性定义了项目在主轴上的对齐方式。
1
.box {
  justify-content: flex-start | flex-end | center | space-between | space-around;
}123
```

![这里写图片描述](https://img-blog.csdn.net/20180202095041604?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQveXVzaHVhbmd5dXNodWFuZw==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

它可能取5个值，具体对齐方式与轴的方向有关。下面假设主轴为从左到右。

>  flex-start（默认值）：左对齐
>  	  flex-end：右对齐
>  		center： 居中
>  		space-between：两端对齐，项目之间的间隔都相等。
>  		space-around：每个项目两侧的间隔相等。所以，项目之间的间隔比项目与边框的间隔大一倍。

#### (5)align-items属性

跟随主轴的方向进行变化

```
align-items属性定义项目在交叉轴上如何对齐。
1
```

##### 交叉轴

```
主轴沿逆时针方向旋转 90° 就得到了交叉轴，交叉轴的起始端和末尾段也由 flex-start 和 flex-end 表示。
1
```

![这里写图片描述](https://img-blog.csdn.net/20180202104156792?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQveXVzaHVhbmd5dXNodWFuZw==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

```
.box {
  align-items: flex-start | flex-end | center | baseline | stretch;
}123
```

![这里写图片描述](https://img-blog.csdn.net/20180202095419172?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQveXVzaHVhbmd5dXNodWFuZw==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

它可能取5个值。具体的对齐方式与交叉轴的方向有关，下面假设交叉轴从上到下。

> flex-start：交叉轴的起点对齐。
>     flex-end：交叉轴的终点对齐。
>     center：交叉轴的中点对齐。
>     baseline: 项目的第一行文字的基线对齐。
>     stretch（默认值）：如果项目未设置高度或设为auto，将占满整个容器的高度。

stretch 拉伸 主轴是横向的话，看到该效果需要去掉子元素的高度，子元素的高会拉伸到和父元素一样高

#### (6)align-content属性

```
align-content属性定义了多根轴线的对齐方式。如果项目只有一根轴线，该属性不起作用。
1
.box {
  align-content: flex-start | flex-end | center | space-between | space-around | stretch;
}
```

![这里写图片描述](https://img-blog.csdn.net/20180202095650118?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQveXVzaHVhbmd5dXNodWFuZw==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

该属性可能取6个值。

> flex-start：与交叉轴的起点对齐。
>     flex-end：与交叉轴的终点对齐。
> 	   center：与交叉轴的中点对齐。
> 	   space-between：与交叉轴两端对齐，轴线之间的间隔平均分布。
> 	   space-around：每根轴线两侧的间隔都相等。所以，轴线之间的间隔比轴线与边框的间隔大一倍。
> 	   stretch（默认值）：轴线占满整个交叉轴。

### 子元素属性

以下6个属性设置在项目上。

> order
> flex-grow
> flex-shrink
> flex-basis
> flex
> align-self

#### （1）order

order属性定义项目的排列顺序。数值越小，排列越靠前，默认为0。

![](https://img-blog.csdn.net/20180202100556875?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQveXVzaHVhbmd5dXNodWFuZw==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

#### (2)flex-grow

给宽度，多余平分，不给宽度，均分,默认值为0

> 如果所有项目的flex-grow属性都为1，则它们将等分剩余空间（如果有的话）。
> 如果一个项目的flex-grow属性为2，其他项目都为1，则前者占据的剩余空间将比其他项多一倍。

##### 拓展

```
计算公式    
1
```

比如剩余空间为 x，三个元素的 flex-grow 分别为 a，b，c。设 sum 为 a + b + c。那么三个元素将得到剩余空间分别是 x * a / sum, x * b / sum, x * c / sum，是为权重也

- sum>1:按比例计算多余的剩余空间，在原来元素的基础上加上多余空间
- sum<1:上面式子中的 sum 将会使用 1 来参与计算，而不论它们的和是多少。也就是说，当所有的元素的 flex-grow 之和小于 1 的时候，剩余空间不会全部分配给各个元素。所有的sum都是1

#### （3）flex-shrink：缩小比例(数字)

> - 1 默认值 压缩
> - 0 不压缩  
> - **滚动导航的实现**
>     1. 设置子项不压缩 flex-shrink:0;
>     2. 给父元素设置溢出显示滚动条 overflow-x:auto;

```
如果所有项目的flex-shrink属性都为1，当空间不足时，都将等比例缩小。
如果一个项目的flex-shrink属性为0，其他项目都为1，则空间不足时，前者不缩小。
负值对该属性无效。  
123
```

![这里写图片描述](https://img-blog.csdn.net/20180202101728525?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQveXVzaHVhbmd5dXNodWFuZw==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

##### 拓展

> 计算公式：

- shirink的和大于1，

    ```
    计算溢出宽度-------当前值-父元素
    收缩宽度-----------溢出宽度*（(flex-shrink）/各元素收缩因子之和）
    最终宽度-----------元素本身宽度-收缩宽度
    123
    ```

- shrink的和小于1
    并不会收缩所有的空间，而只会收缩 flex-shrink 之和相对于 1 的比例的空间。

    ```
     计算溢出宽度-------（当前值-父元素）
     收缩宽度-----------溢出宽度*（(flex-shrink）/1）
     最终宽度-----------元素本身宽度-收缩宽度
    123
    ```

总结：如果所有元素的 flex-grow/shrink 之和大于等于 1，则所有子元素的尺寸一定会被调整到适应父元素的尺寸。如果 flex-grow/shrink 之和小于 1，则只会 grow 或 shrink 所有元素 flex-grow/shrink 之和相对于 1 的比例

#### （4） flex-basis属性

flex-basis属性定义了在分配多余空间之前，项目占据的主轴空间（main size）。浏览器根据这个属性，计算主轴是否有多余空间。它的默认值为auto，即项目的本来大小。

```
.item {
  flex-basis: <length> | auto; /* default auto */
}123
```

它可以设为跟width或height属性一样的值（比如350px），则项目将占据固定空间。

#### （5） flex属性

```
flex属性是flex-grow, flex-shrink 和 flex-basis的简写，默认值为0 1 auto。后两个属性可选。
1
.item {
  flex: none | [ <'flex-grow'> <'flex-shrink'>? || <'flex-basis'> ]
}123
```

该属性有两个快捷值：auto (1 1 auto) 和 none (0 0 auto)。
建议优先使用这个属性，而不是单独写三个分离的属性，因为浏览器会推算相关值。

#### （6）align-self属性

```
align-self属性允许单个项目有与其他项目不一样的对齐方式，可覆盖align-items属性。

默认值为auto，表示继承父元素的align-items属性，如果没有父元素，则等同于stretch。
123
.item {
  align-self: auto | flex-start | flex-end | center | baseline | stretch;
}123
```

![这里写图片描述](https://img-blog.csdn.net/20180202103220164?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQveXVzaHVhbmd5dXNodWFuZw==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

#### 利用弹性盒对盒子进行水平垂直居中

  ```css
    父元素{
      display:flex;
      justify-content:center;
      align-items:center;
    }
  ```
