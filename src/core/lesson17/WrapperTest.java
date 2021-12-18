package core.lesson17;

import java.lang.annotation.Annotation;

@MyAnnotation()
@Deprecated
public class WrapperTest {

    @Deprecated
    WrapperTest(){

    }

    public static void main(String[] args) {
        WrapperTest wp = new WrapperTest();
        Annotation[] annotations = wp.getClass().getAnnotations();
        for (Annotation annotation : annotations) {
            if(annotation instanceof MyAnnotation) {
                System.out.println("MyAnnotation is exists" + annotation);
            }
        }
    }

    void met1(){
        System.out.println();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
