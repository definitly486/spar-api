package lj;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zdlpuopuiu extends ojitshcjhn {

    public static final class iobyxmoadg implements btonecajqb {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ Iterator f62689iobyxmoadg;

        public iobyxmoadg(Iterator it) {
            this.f62689iobyxmoadg = it;
        }

        @Override // lj.btonecajqb
        public Iterator iterator() {
            return this.f62689iobyxmoadg;
        }
    }

    public static btonecajqb agtfadlqog(final Object obj, tg.draadjrbmk nextFunction) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(nextFunction, "nextFunction");
        return obj == null ? gxszxtbevo.f62656iobyxmoadg : new dxjokdxxww(new tg.iobyxmoadg() { // from class: lj.rgvfuqvkyq
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return zdlpuopuiu.oxmwwwfdhm(obj);
            }
        }, nextFunction);
    }

    public static final btonecajqb btonecajqb(btonecajqb btonecajqbVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(btonecajqbVar, "<this>");
        return gtknphoqwx(btonecajqbVar, new tg.draadjrbmk() { // from class: lj.oxmwwwfdhm
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return zdlpuopuiu.draadjrbmk((btonecajqb) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterator draadjrbmk(btonecajqb it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        return it.iterator();
    }

    public static btonecajqb dxjokdxxww() {
        return gxszxtbevo.f62656iobyxmoadg;
    }

    private static final btonecajqb gtknphoqwx(btonecajqb btonecajqbVar, tg.draadjrbmk draadjrbmkVar) {
        return btonecajqbVar instanceof pmvmpeiblj ? ((pmvmpeiblj) btonecajqbVar).ppxfxbqfkf(draadjrbmkVar) : new nufgyqmvbu(btonecajqbVar, new tg.draadjrbmk() { // from class: lj.kcexrzcfyt
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return zdlpuopuiu.wflxmlrfwp(obj);
            }
        }, draadjrbmkVar);
    }

    public static btonecajqb kcexrzcfyt(Object... elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        return hg.agtfadlqog.jlmebxxoox(elements);
    }

    public static btonecajqb lqeggnwhkg(Iterator it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "<this>");
        return nufgyqmvbu(new iobyxmoadg(it));
    }

    public static final btonecajqb nufgyqmvbu(btonecajqb btonecajqbVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(btonecajqbVar, "<this>");
        return btonecajqbVar instanceof lj.iobyxmoadg ? btonecajqbVar : new lj.iobyxmoadg(btonecajqbVar);
    }

    public static btonecajqb ojitshcjhn(final tg.iobyxmoadg nextFunction) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(nextFunction, "nextFunction");
        return nufgyqmvbu(new dxjokdxxww(nextFunction, new tg.draadjrbmk() { // from class: lj.vdvldrhtss
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return zdlpuopuiu.vdvldrhtss(nextFunction, obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object oxmwwwfdhm(Object obj) {
        return obj;
    }

    public static btonecajqb rgvfuqvkyq(tg.iobyxmoadg seedFunction, tg.draadjrbmk nextFunction) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(seedFunction, "seedFunction");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(nextFunction, "nextFunction");
        return new dxjokdxxww(seedFunction, nextFunction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object vdvldrhtss(tg.iobyxmoadg iobyxmoadgVar, Object it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        return iobyxmoadgVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object wflxmlrfwp(Object obj) {
        return obj;
    }
}
