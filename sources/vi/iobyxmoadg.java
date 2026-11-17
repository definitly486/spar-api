package vi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iobyxmoadg implements nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ui.iobyxmoadg f116922iobyxmoadg;

    /* JADX INFO: renamed from: vi.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public /* synthetic */ class C2913iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f116923iobyxmoadg;

        static {
            int[] iArr = new int[wkgbmnqykc.values().length];
            try {
                iArr[wkgbmnqykc.PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[wkgbmnqykc.PROPERTY_GETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[wkgbmnqykc.PROPERTY_SETTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f116923iobyxmoadg = iArr;
        }
    }

    public iobyxmoadg(ui.iobyxmoadg protocol) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(protocol, "protocol");
        this.f116922iobyxmoadg = protocol;
    }

    @Override // vi.nufgyqmvbu
    public List btonecajqb(cllcsxoeiz container, kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog proto, wkgbmnqykc kind) {
        List listWflxmlrfwp;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(container, "container");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(proto, "proto");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kind, "kind");
        if (proto instanceof di.wkgbmnqykc) {
            listWflxmlrfwp = (List) ((di.wkgbmnqykc) proto).jyumaefscl(this.f116922iobyxmoadg.ppxfxbqfkf());
        } else if (proto instanceof di.dxjokdxxww) {
            listWflxmlrfwp = (List) ((di.dxjokdxxww) proto).jyumaefscl(this.f116922iobyxmoadg.gxszxtbevo());
        } else {
            if (!(proto instanceof di.agtfadlqog)) {
                throw new IllegalStateException(("Unknown message: " + proto).toString());
            }
            int i13 = C2913iobyxmoadg.f116923iobyxmoadg[kind.ordinal()];
            if (i13 == 1) {
                listWflxmlrfwp = (List) ((di.agtfadlqog) proto).jyumaefscl(this.f116922iobyxmoadg.dxjokdxxww());
            } else if (i13 == 2) {
                listWflxmlrfwp = (List) ((di.agtfadlqog) proto).jyumaefscl(this.f116922iobyxmoadg.wflxmlrfwp());
            } else {
                if (i13 != 3) {
                    throw new IllegalStateException("Unsupported callable kind with property proto");
                }
                listWflxmlrfwp = (List) ((di.agtfadlqog) proto).jyumaefscl(this.f116922iobyxmoadg.agtfadlqog());
            }
        }
        if (listWflxmlrfwp == null) {
            listWflxmlrfwp = hg.jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listWflxmlrfwp, 10));
        Iterator it = listWflxmlrfwp.iterator();
        while (it.hasNext()) {
            arrayList.add(iobyxmoadg((di.zoijcleaow) it.next(), container.zoijcleaow()));
        }
        return arrayList;
    }

    @Override // vi.nufgyqmvbu
    public List draadjrbmk(cllcsxoeiz container, di.agtfadlqog proto) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(container, "container");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(proto, "proto");
        kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.gxszxtbevo gxszxtbevoVarGtknphoqwx = this.f116922iobyxmoadg.gtknphoqwx();
        List listWflxmlrfwp = gxszxtbevoVarGtknphoqwx != null ? (List) proto.jyumaefscl(gxszxtbevoVarGtknphoqwx) : null;
        if (listWflxmlrfwp == null) {
            listWflxmlrfwp = hg.jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listWflxmlrfwp, 10));
        Iterator it = listWflxmlrfwp.iterator();
        while (it.hasNext()) {
            arrayList.add(iobyxmoadg((di.zoijcleaow) it.next(), container.zoijcleaow()));
        }
        return arrayList;
    }

    @Override // vi.nufgyqmvbu
    public List dxjokdxxww(cllcsxoeiz container, kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog proto, wkgbmnqykc kind) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(container, "container");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(proto, "proto");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kind, "kind");
        List listWflxmlrfwp = null;
        if (proto instanceof di.dxjokdxxww) {
            kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.gxszxtbevo gxszxtbevoVarLqeggnwhkg = this.f116922iobyxmoadg.lqeggnwhkg();
            if (gxszxtbevoVarLqeggnwhkg != null) {
                listWflxmlrfwp = (List) ((di.dxjokdxxww) proto).jyumaefscl(gxszxtbevoVarLqeggnwhkg);
            }
        } else {
            if (!(proto instanceof di.agtfadlqog)) {
                throw new IllegalStateException(("Unknown message: " + proto).toString());
            }
            int i13 = C2913iobyxmoadg.f116923iobyxmoadg[kind.ordinal()];
            if (i13 != 1 && i13 != 2 && i13 != 3) {
                throw new IllegalStateException(("Unsupported callable kind with property proto for receiver annotations: " + kind).toString());
            }
            kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.gxszxtbevo gxszxtbevoVarDraadjrbmk = this.f116922iobyxmoadg.draadjrbmk();
            if (gxszxtbevoVarDraadjrbmk != null) {
                listWflxmlrfwp = (List) ((di.agtfadlqog) proto).jyumaefscl(gxszxtbevoVarDraadjrbmk);
            }
        }
        if (listWflxmlrfwp == null) {
            listWflxmlrfwp = hg.jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listWflxmlrfwp, 10));
        Iterator it = listWflxmlrfwp.iterator();
        while (it.hasNext()) {
            arrayList.add(iobyxmoadg((di.zoijcleaow) it.next(), container.zoijcleaow()));
        }
        return arrayList;
    }

    @Override // vi.nufgyqmvbu
    public List gtknphoqwx(cllcsxoeiz.iobyxmoadg container) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(container, "container");
        List listWflxmlrfwp = (List) container.gxszxtbevo().jyumaefscl(this.f116922iobyxmoadg.iobyxmoadg());
        if (listWflxmlrfwp == null) {
            listWflxmlrfwp = hg.jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listWflxmlrfwp, 10));
        Iterator it = listWflxmlrfwp.iterator();
        while (it.hasNext()) {
            arrayList.add(iobyxmoadg((di.zoijcleaow) it.next(), container.zoijcleaow()));
        }
        return arrayList;
    }

    @Override // vi.nufgyqmvbu
    public List gxszxtbevo(di.kcexrzcfyt proto, fi.ppxfxbqfkf nameResolver) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(proto, "proto");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(nameResolver, "nameResolver");
        List listWflxmlrfwp = (List) proto.jyumaefscl(this.f116922iobyxmoadg.rgvfuqvkyq());
        if (listWflxmlrfwp == null) {
            listWflxmlrfwp = hg.jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listWflxmlrfwp, 10));
        Iterator it = listWflxmlrfwp.iterator();
        while (it.hasNext()) {
            arrayList.add(iobyxmoadg((di.zoijcleaow) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // vi.nufgyqmvbu
    public List lqeggnwhkg(cllcsxoeiz container, di.agtfadlqog proto) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(container, "container");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(proto, "proto");
        kotlin.reflect.jvm.internal.impl.protobuf.nufgyqmvbu.gxszxtbevo gxszxtbevoVarBtonecajqb = this.f116922iobyxmoadg.btonecajqb();
        List listWflxmlrfwp = gxszxtbevoVarBtonecajqb != null ? (List) proto.jyumaefscl(gxszxtbevoVarBtonecajqb) : null;
        if (listWflxmlrfwp == null) {
            listWflxmlrfwp = hg.jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listWflxmlrfwp, 10));
        Iterator it = listWflxmlrfwp.iterator();
        while (it.hasNext()) {
            arrayList.add(iobyxmoadg((di.zoijcleaow) it.next(), container.zoijcleaow()));
        }
        return arrayList;
    }

    @Override // vi.nufgyqmvbu
    public List nufgyqmvbu(cllcsxoeiz container, kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog callableProto, wkgbmnqykc kind, int i13, di.yggfygwlhe proto) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(container, "container");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(callableProto, "callableProto");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kind, "kind");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(proto, "proto");
        List listWflxmlrfwp = (List) proto.jyumaefscl(this.f116922iobyxmoadg.nufgyqmvbu());
        if (listWflxmlrfwp == null) {
            listWflxmlrfwp = hg.jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listWflxmlrfwp, 10));
        Iterator it = listWflxmlrfwp.iterator();
        while (it.hasNext()) {
            arrayList.add(iobyxmoadg((di.zoijcleaow) it.next(), container.zoijcleaow()));
        }
        return arrayList;
    }

    protected final ui.iobyxmoadg wflxmlrfwp() {
        return this.f116922iobyxmoadg;
    }

    @Override // vi.nufgyqmvbu
    public List wkgbmnqykc(di.vdvldrhtss proto, fi.ppxfxbqfkf nameResolver) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(proto, "proto");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(nameResolver, "nameResolver");
        List listWflxmlrfwp = (List) proto.jyumaefscl(this.f116922iobyxmoadg.ojitshcjhn());
        if (listWflxmlrfwp == null) {
            listWflxmlrfwp = hg.jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listWflxmlrfwp, 10));
        Iterator it = listWflxmlrfwp.iterator();
        while (it.hasNext()) {
            arrayList.add(iobyxmoadg((di.zoijcleaow) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // vi.nufgyqmvbu
    public List zoijcleaow(cllcsxoeiz container, di.lqeggnwhkg proto) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(container, "container");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(proto, "proto");
        List listWflxmlrfwp = (List) proto.jyumaefscl(this.f116922iobyxmoadg.wkgbmnqykc());
        if (listWflxmlrfwp == null) {
            listWflxmlrfwp = hg.jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listWflxmlrfwp, 10));
        Iterator it = listWflxmlrfwp.iterator();
        while (it.hasNext()) {
            arrayList.add(iobyxmoadg((di.zoijcleaow) it.next(), container.zoijcleaow()));
        }
        return arrayList;
    }
}
