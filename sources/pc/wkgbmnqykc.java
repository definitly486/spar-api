package pc;

/* JADX INFO: loaded from: classes2.dex */
public @interface wkgbmnqykc {

    public enum iobyxmoadg {
        DEFAULT,
        SIGNED,
        FIXED
    }

    iobyxmoadg intEncoding() default iobyxmoadg.DEFAULT;

    int tag();
}
