package com.google.crypto.tink.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gtknphoqwx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Class f23834iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Class f23835zoijcleaow;

    class iobyxmoadg extends gtknphoqwx {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f23836ppxfxbqfkf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(Class cls, Class cls2, zoijcleaow zoijcleaowVar) {
            super(cls, cls2, null);
            this.f23836ppxfxbqfkf = zoijcleaowVar;
        }
    }

    public interface zoijcleaow {
    }

    /* synthetic */ gtknphoqwx(Class cls, Class cls2, iobyxmoadg iobyxmoadgVar) {
        this(cls, cls2);
    }

    public static gtknphoqwx iobyxmoadg(zoijcleaow zoijcleaowVar, Class cls, Class cls2) {
        return new iobyxmoadg(cls, cls2, zoijcleaowVar);
    }

    public Class ppxfxbqfkf() {
        return this.f23835zoijcleaow;
    }

    public Class zoijcleaow() {
        return this.f23834iobyxmoadg;
    }

    private gtknphoqwx(Class cls, Class cls2) {
        this.f23834iobyxmoadg = cls;
        this.f23835zoijcleaow = cls2;
    }
}
