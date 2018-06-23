# compressor4j
jsp前台压缩

##介绍
compressor4j用于java web项目中服务端压缩前端输出的代码。
引用谷歌的[htmlcompressor](http://code.google.com/p/htmlcompressor/)1.5.2版本上并做了可用性的修复。
-默认打开html中的js、css压缩
-默认js压缩使用closure压缩方式
-添加对[yuicompressor](https://github.com/yui/yuicompressor)2.4.7版本的引用
-添加对[closure](https://developers.google.com/closure/compiler/)的引用

##原htmlcompressor的问题
-需要自行添加yuicompressor、closure的引用
-使用yuicompressor2.4.8版本报Bad language version: 170错误
-使用yuicompressor 2.4.7版本，部分js代码后多添加了get 字符串
-使用closure报找不到类


##使用方法
将本项目编译后打包成compressor4j.jar添加到私服中
maven项目中添加依赖
```xml
		<dependency>
			<groupId>helper</groupId>
			<artifactId>compressor4j</artifactId>
			<version>1.0.0</version>
		</dependency>
```
以jsp为例：
添加taglib
```jsp
<%@ taglib uri="/helper/compressor4j" prefix="compress" %>
```
如jsp输出为html则在html的最外层添加【默认其中内嵌的js、css都会压缩】
```jsp
<compress:html>
<%--TODO: your code--%>
</compress:html>
```
同理如jsp输出则使用
```jsp
<compress:js>
<%--TODO: your code--%>
</compress:js>
```
css输出则使用
```jsp
<compress:css>
<%--TODO: your code--%>
</compress:css>
```
#注意
js压缩对原js的书写规范比较严谨，会自动添加'use strict';
因此需要注意不严谨的js可能的坑。
-变量一定先声明再使用;
-js中创建html元素且元素中使用var声明的方法，压缩过程发现该参数没有地方使用会自动删掉

