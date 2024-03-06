package me.alphamode.wisp.env;

import java.lang.annotation.*;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
@Documented
public @interface OnlyInInterfaces {
    Class<?>[] serverItfs();

    Class<?>[] clientItfs();
}