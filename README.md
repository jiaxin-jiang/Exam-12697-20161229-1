#在控制台输出
#com.jjx.App开始运行
#com.jjx.handler 中为用来监测Context开始和结束的ApplicationListener
#com.jjx.aop中为AfterInsertFilmEvent和BeforeInsertFilmEvent
#在输入语言id是会有验证
如果不为数字则提示:"您输入的语言ID有误！"
如果不是语言id之中的则为："语言 ID不存在"

mvn exec:java -Dexec.mainClass="com.jjx.App"