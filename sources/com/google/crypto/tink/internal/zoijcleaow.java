package com.google.crypto.tink.internal;

import bb.esjtqupxsv;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final pb.iobyxmoadg f23873iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Class f23874zoijcleaow;

    class iobyxmoadg extends zoijcleaow {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ InterfaceC0413zoijcleaow f23875ppxfxbqfkf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(pb.iobyxmoadg iobyxmoadgVar, Class cls, InterfaceC0413zoijcleaow interfaceC0413zoijcleaow) {
            super(iobyxmoadgVar, cls, null);
            this.f23875ppxfxbqfkf = interfaceC0413zoijcleaow;
        }

        @Override // com.google.crypto.tink.internal.zoijcleaow
        public bb.lqeggnwhkg wkgbmnqykc(vdvldrhtss vdvldrhtssVar, esjtqupxsv esjtqupxsvVar) {
            return this.f23875ppxfxbqfkf.iobyxmoadg(vdvldrhtssVar, esjtqupxsvVar);
        }
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.internal.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public interface InterfaceC0413zoijcleaow {
        bb.lqeggnwhkg iobyxmoadg(vdvldrhtss vdvldrhtssVar, esjtqupxsv esjtqupxsvVar);
    }

    /* synthetic */ zoijcleaow(pb.iobyxmoadg iobyxmoadgVar, Class cls, iobyxmoadg iobyxmoadgVar2) {
        this(iobyxmoadgVar, cls);
    }

    public static zoijcleaow iobyxmoadg(InterfaceC0413zoijcleaow interfaceC0413zoijcleaow, pb.iobyxmoadg iobyxmoadgVar, Class cls) {
        return new iobyxmoadg(iobyxmoadgVar, cls, interfaceC0413zoijcleaow);
    }

    public final Class ppxfxbqfkf() {
        return this.f23874zoijcleaow;
    }

    public abstract bb.lqeggnwhkg wkgbmnqykc(vdvldrhtss vdvldrhtssVar, esjtqupxsv esjtqupxsvVar);

    public final pb.iobyxmoadg zoijcleaow() {
        return this.f23873iobyxmoadg;
    }

    private zoijcleaow(pb.iobyxmoadg iobyxmoadgVar, Class cls) {
        this.f23873iobyxmoadg = iobyxmoadgVar;
        this.f23874zoijcleaow = cls;
    }
}
