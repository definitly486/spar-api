package bk;

import gg.wwaezpbzkn;
import hg.hkdspvbjdz;
import hg.jyumaefscl;
import hg.tzroggbefp;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class gtknphoqwx extends fk.zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Map f16632eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ah.wkgbmnqykc f16633iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final gg.gtknphoqwx f16634ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Map f16635wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private List f16636zoijcleaow;

    public static final class iobyxmoadg implements hkdspvbjdz {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ Iterable f16637iobyxmoadg;

        public iobyxmoadg(Iterable iterable) {
            this.f16637iobyxmoadg = iterable;
        }

        @Override // hg.hkdspvbjdz
        public Object iobyxmoadg(Object obj) {
            return ((zoijcleaow) ((Map.Entry) obj).getValue()).iobyxmoadg().nufgyqmvbu();
        }

        @Override // hg.hkdspvbjdz
        public Iterator zoijcleaow() {
            return this.f16637iobyxmoadg.iterator();
        }
    }

    public gtknphoqwx(final String serialName, ah.wkgbmnqykc baseClass, ah.wkgbmnqykc[] subclasses, zoijcleaow[] subclassSerializers) {
        zdlpuopuiu.btonecajqb(serialName, "serialName");
        zdlpuopuiu.btonecajqb(baseClass, "baseClass");
        zdlpuopuiu.btonecajqb(subclasses, "subclasses");
        zdlpuopuiu.btonecajqb(subclassSerializers, "subclassSerializers");
        this.f16633iobyxmoadg = baseClass;
        this.f16636zoijcleaow = jyumaefscl.wflxmlrfwp();
        this.f16634ppxfxbqfkf = gg.draadjrbmk.iobyxmoadg(gg.ojitshcjhn.PUBLICATION, new tg.iobyxmoadg() { // from class: bk.nufgyqmvbu
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return gtknphoqwx.agtfadlqog(serialName, this);
            }
        });
        if (subclasses.length != subclassSerializers.length) {
            throw new IllegalArgumentException("All subclasses of sealed class " + btonecajqb().jyumaefscl() + " should be marked @Serializable");
        }
        Map mapKcexrzcfyt = tzroggbefp.kcexrzcfyt(hg.agtfadlqog.z(subclasses, subclassSerializers));
        this.f16635wkgbmnqykc = mapKcexrzcfyt;
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(mapKcexrzcfyt.entrySet());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator itZoijcleaow = iobyxmoadgVar.zoijcleaow();
        while (itZoijcleaow.hasNext()) {
            Object next = itZoijcleaow.next();
            Object objIobyxmoadg = iobyxmoadgVar.iobyxmoadg(next);
            Object obj = linkedHashMap.get(objIobyxmoadg);
            if (obj == null) {
                linkedHashMap.containsKey(objIobyxmoadg);
            }
            Map.Entry entry = (Map.Entry) next;
            Map.Entry entry2 = (Map.Entry) obj;
            String str = (String) objIobyxmoadg;
            if (entry2 != null) {
                throw new IllegalStateException(("Multiple sealed subclasses of '" + btonecajqb() + "' have the same serial name '" + str + "': '" + entry2.getKey() + "', '" + entry.getKey() + '\'').toString());
            }
            linkedHashMap.put(objIobyxmoadg, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(tzroggbefp.eablkybsjg(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (zoijcleaow) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.f16632eablkybsjg = linkedHashMap2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dk.gxszxtbevo agtfadlqog(String str, final gtknphoqwx gtknphoqwxVar) {
        return dk.wflxmlrfwp.lqeggnwhkg(str, dk.wkgbmnqykc.zoijcleaow.f29103iobyxmoadg, new dk.gxszxtbevo[0], new tg.draadjrbmk() { // from class: bk.dxjokdxxww
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return gtknphoqwx.ojitshcjhn(this.f16630zdlpuopuiu, (dk.iobyxmoadg) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ojitshcjhn(final gtknphoqwx gtknphoqwxVar, dk.iobyxmoadg buildSerialDescriptor) {
        zdlpuopuiu.btonecajqb(buildSerialDescriptor, "$this$buildSerialDescriptor");
        dk.iobyxmoadg.zoijcleaow(buildSerialDescriptor, "type", ck.iobyxmoadg.ylkuphrtab(kotlin.jvm.internal.tzroggbefp.f60034iobyxmoadg).iobyxmoadg(), null, false, 12, null);
        dk.iobyxmoadg.zoijcleaow(buildSerialDescriptor, "value", dk.wflxmlrfwp.lqeggnwhkg("kotlinx.serialization.Sealed<" + gtknphoqwxVar.btonecajqb().jyumaefscl() + '>', dk.agtfadlqog.iobyxmoadg.f29057iobyxmoadg, new dk.gxszxtbevo[0], new tg.draadjrbmk() { // from class: bk.btonecajqb
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return gtknphoqwx.rgvfuqvkyq(this.f16629zdlpuopuiu, (dk.iobyxmoadg) obj);
            }
        }), null, false, 12, null);
        buildSerialDescriptor.nufgyqmvbu(gtknphoqwxVar.f16636zoijcleaow);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn rgvfuqvkyq(gtknphoqwx gtknphoqwxVar, dk.iobyxmoadg buildSerialDescriptor) {
        zdlpuopuiu.btonecajqb(buildSerialDescriptor, "$this$buildSerialDescriptor");
        for (Map.Entry entry : gtknphoqwxVar.f16632eablkybsjg.entrySet()) {
            dk.iobyxmoadg.zoijcleaow(buildSerialDescriptor, (String) entry.getKey(), ((zoijcleaow) entry.getValue()).iobyxmoadg(), null, false, 12, null);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // fk.zoijcleaow
    public ah.wkgbmnqykc btonecajqb() {
        return this.f16633iobyxmoadg;
    }

    @Override // fk.zoijcleaow
    public agtfadlqog dxjokdxxww(ek.gxszxtbevo encoder, Object value) {
        zdlpuopuiu.btonecajqb(encoder, "encoder");
        zdlpuopuiu.btonecajqb(value, "value");
        agtfadlqog agtfadlqogVarDxjokdxxww = (zoijcleaow) this.f16635wkgbmnqykc.get(cllcsxoeiz.zoijcleaow(value.getClass()));
        if (agtfadlqogVarDxjokdxxww == null) {
            agtfadlqogVarDxjokdxxww = super.dxjokdxxww(encoder, value);
        }
        if (agtfadlqogVarDxjokdxxww != null) {
            return agtfadlqogVarDxjokdxxww;
        }
        return null;
    }

    @Override // bk.zoijcleaow, bk.agtfadlqog, bk.iobyxmoadg
    public dk.gxszxtbevo iobyxmoadg() {
        return (dk.gxszxtbevo) this.f16634ppxfxbqfkf.getValue();
    }

    @Override // fk.zoijcleaow
    public bk.iobyxmoadg nufgyqmvbu(ek.ppxfxbqfkf decoder, String str) {
        zdlpuopuiu.btonecajqb(decoder, "decoder");
        zoijcleaow zoijcleaowVar = (zoijcleaow) this.f16632eablkybsjg.get(str);
        return zoijcleaowVar != null ? zoijcleaowVar : super.nufgyqmvbu(decoder, str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gtknphoqwx(String serialName, ah.wkgbmnqykc baseClass, ah.wkgbmnqykc[] subclasses, zoijcleaow[] subclassSerializers, Annotation[] classAnnotations) {
        this(serialName, baseClass, subclasses, subclassSerializers);
        zdlpuopuiu.btonecajqb(serialName, "serialName");
        zdlpuopuiu.btonecajqb(baseClass, "baseClass");
        zdlpuopuiu.btonecajqb(subclasses, "subclasses");
        zdlpuopuiu.btonecajqb(subclassSerializers, "subclassSerializers");
        zdlpuopuiu.btonecajqb(classAnnotations, "classAnnotations");
        this.f16636zoijcleaow = hg.agtfadlqog.gxszxtbevo(classAnnotations);
    }
}
