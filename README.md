
@Component：Spring会自动检测并配置为一个Bean，是一个类级别的注解。

@Bean：是一个方法级别的注解，需要配合@Configuration使用。当你需要将第三方库中的组件装配到你的应用中，你是没有办法在它的类上添加@Component注解的。还有一种情况就是SpringBoot提供了一些可能会用，但是没有自动注入的类，这些时候就需要用到@Bean。
