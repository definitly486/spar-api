package com.google.crypto.tink.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class draadjrbmk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Class f23826iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Class f23827zoijcleaow;

    class iobyxmoadg extends draadjrbmk {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f23828ppxfxbqfkf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(Class cls, Class cls2, zoijcleaow zoijcleaowVar) {
            super(cls, cls2, null);
            this.f23828ppxfxbqfkf = zoijcleaowVar;
        }

        @Override // com.google.crypto.tink.internal.draadjrbmk
        public Object iobyxmoadg(bb.lqeggnwhkg lqeggnwhkgVar) {
            return this.f23828ppxfxbqfkf.iobyxmoadg(lqeggnwhkgVar);
        }
    }

    public interface zoijcleaow {
        Object iobyxmoadg(bb.lqeggnwhkg lqeggnwhkgVar);
    }

    /* synthetic */ draadjrbmk(Class cls, Class cls2, iobyxmoadg iobyxmoadgVar) {
        this(cls, cls2);
    }

    public static draadjrbmk zoijcleaow(zoijcleaow zoijcleaowVar, Class cls, Class cls2) {
        return new iobyxmoadg(cls, cls2, zoijcleaowVar);
    }

    public abstract Object iobyxmoadg(bb.lqeggnwhkg lqeggnwhkgVar);

    public Class ppxfxbqfkf() {
        return this.f23826iobyxmoadg;
    }

    public Class wkgbmnqykc() {
        return this.f23827zoijcleaow;
    }

    private draadjrbmk(Class cls, Class cls2) {
        this.f23826iobyxmoadg = cls;
        this.f23827zoijcleaow = cls2;
    }
}
