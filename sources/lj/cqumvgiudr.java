package lj;

import hg.ikoacuggdj;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class cqumvgiudr extends yggfygwlhe {

    public static final class iobyxmoadg implements Iterable, ug.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ btonecajqb f62636zdlpuopuiu;

        public iobyxmoadg(btonecajqb btonecajqbVar) {
            this.f62636zdlpuopuiu = btonecajqbVar;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f62636zdlpuopuiu.iterator();
        }
    }

    /* synthetic */ class ppxfxbqfkf extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final ppxfxbqfkf f62637zdlpuopuiu = new ppxfxbqfkf();

        ppxfxbqfkf() {
            super(1, btonecajqb.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Iterator invoke(btonecajqb p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return p13.iterator();
        }
    }

    public static final class wkgbmnqykc implements btonecajqb {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ btonecajqb f62638iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ Comparator f62639zoijcleaow;

        wkgbmnqykc(btonecajqb btonecajqbVar, Comparator comparator) {
            this.f62638iobyxmoadg = btonecajqbVar;
            this.f62639zoijcleaow = comparator;
        }

        @Override // lj.btonecajqb
        public Iterator iterator() {
            List listJlmebxxoox = wflxmlrfwp.jlmebxxoox(this.f62638iobyxmoadg);
            hg.jyumaefscl.zynmafqrjb(listJlmebxxoox, this.f62639zoijcleaow);
            return listJlmebxxoox.iterator();
        }
    }

    /* synthetic */ class zoijcleaow extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f62640zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Iterator invoke(Iterable p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return p13.iterator();
        }
    }

    public static btonecajqb cdpycssgdh(btonecajqb btonecajqbVar, tg.draadjrbmk predicate) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(btonecajqbVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(predicate, "predicate");
        return new lqeggnwhkg(btonecajqbVar, false, predicate);
    }

    public static Object cllcsxoeiz(btonecajqb btonecajqbVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(btonecajqbVar, "<this>");
        Iterator it = btonecajqbVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static int cqumvgiudr(btonecajqb btonecajqbVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(btonecajqbVar, "<this>");
        Iterator it = btonecajqbVar.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            it.next();
            i13++;
            if (i13 < 0) {
                hg.jyumaefscl.jyumaefscl();
            }
        }
        return i13;
    }

    public static List crxdokpmqz(btonecajqb btonecajqbVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(btonecajqbVar, "<this>");
        Iterator it = btonecajqbVar.iterator();
        if (!it.hasNext()) {
            return hg.jyumaefscl.wflxmlrfwp();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return hg.jyumaefscl.eablkybsjg(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static btonecajqb dsvhmnatus(btonecajqb btonecajqbVar, tg.draadjrbmk transform) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(btonecajqbVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(transform, "transform");
        return new pmvmpeiblj(btonecajqbVar, transform);
    }

    public static btonecajqb esjtqupxsv(btonecajqb btonecajqbVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(btonecajqbVar, "<this>");
        return pmvmpeiblj(btonecajqbVar, new tg.draadjrbmk() { // from class: lj.iwizpuwonk
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return cqumvgiudr.lereixgezr(obj);
            }
        });
    }

    public static final Appendable hcddaimhww(btonecajqb btonecajqbVar, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i13, CharSequence truncated, tg.draadjrbmk draadjrbmkVar) throws IOException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(btonecajqbVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(buffer, "buffer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(separator, "separator");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(prefix, "prefix");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(postfix, "postfix");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(truncated, "truncated");
        buffer.append(prefix);
        int i14 = 0;
        for (Object obj : btonecajqbVar) {
            i14++;
            if (i14 > 1) {
                buffer.append(separator);
            }
            if (i13 >= 0 && i14 > i13) {
                break;
            }
            mj.kcexrzcfyt.iobyxmoadg(buffer, obj, draadjrbmkVar);
        }
        if (i13 >= 0 && i14 > i13) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static /* synthetic */ String hkdspvbjdz(btonecajqb btonecajqbVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i13, CharSequence charSequence4, tg.draadjrbmk draadjrbmkVar, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i14 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i14 & 4) == 0 ? charSequence3 : "";
        if ((i14 & 8) != 0) {
            i13 = -1;
        }
        int i15 = i13;
        if ((i14 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i14 & 32) != 0) {
            draadjrbmkVar = null;
        }
        return jpowsppfya(btonecajqbVar, charSequence, charSequence5, charSequence6, i15, charSequence7, draadjrbmkVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean iozdgvuglv(Object obj) {
        return obj == null;
    }

    public static btonecajqb istkbnxepw(btonecajqb btonecajqbVar, tg.draadjrbmk predicate) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(btonecajqbVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(predicate, "predicate");
        return new lqeggnwhkg(btonecajqbVar, true, predicate);
    }

    public static boolean iwizpuwonk(btonecajqb btonecajqbVar, Object obj) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(btonecajqbVar, "<this>");
        return pkzmftpjix(btonecajqbVar, obj) >= 0;
    }

    public static List jlmebxxoox(btonecajqb btonecajqbVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(btonecajqbVar, "<this>");
        return (List) sopmlzcsov(btonecajqbVar, new ArrayList());
    }

    public static final String jpowsppfya(btonecajqb btonecajqbVar, CharSequence separator, CharSequence prefix, CharSequence postfix, int i13, CharSequence truncated, tg.draadjrbmk draadjrbmkVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(btonecajqbVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(separator, "separator");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(prefix, "prefix");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(postfix, "postfix");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(truncated, "truncated");
        return ((StringBuilder) hcddaimhww(btonecajqbVar, new StringBuilder(), separator, prefix, postfix, i13, truncated, draadjrbmkVar)).toString();
    }

    public static Iterable jyumaefscl(btonecajqb btonecajqbVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(btonecajqbVar, "<this>");
        return new iobyxmoadg(btonecajqbVar);
    }

    public static btonecajqb kegysxyocb(btonecajqb btonecajqbVar, Iterable elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(btonecajqbVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        return zdlpuopuiu.btonecajqb(wflxmlrfwp.kcexrzcfyt(btonecajqbVar, hg.jyumaefscl.ikoacuggdj(elements)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object lereixgezr(Object obj) {
        return obj;
    }

    public static Object lmojexxdyd(btonecajqb btonecajqbVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(btonecajqbVar, "<this>");
        Iterator it = btonecajqbVar.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static btonecajqb mbcevpiqjq(btonecajqb btonecajqbVar, btonecajqb elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(btonecajqbVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        return zdlpuopuiu.btonecajqb(wflxmlrfwp.kcexrzcfyt(btonecajqbVar, elements));
    }

    public static btonecajqb ntlheqmsrt(btonecajqb btonecajqbVar, Comparator comparator) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(btonecajqbVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(comparator, "comparator");
        return new wkgbmnqykc(btonecajqbVar, comparator);
    }

    public static final int pkzmftpjix(btonecajqb btonecajqbVar, Object obj) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(btonecajqbVar, "<this>");
        int i13 = 0;
        for (Object obj2 : btonecajqbVar) {
            if (i13 < 0) {
                hg.jyumaefscl.iwizpuwonk();
            }
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj, obj2)) {
                return i13;
            }
            i13++;
        }
        return -1;
    }

    public static final btonecajqb pmvmpeiblj(btonecajqb btonecajqbVar, tg.draadjrbmk selector) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(btonecajqbVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(selector, "selector");
        return new lj.ppxfxbqfkf(btonecajqbVar, selector);
    }

    public static Set ribwqtqdhb(btonecajqb btonecajqbVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(btonecajqbVar, "<this>");
        Iterator it = btonecajqbVar.iterator();
        if (!it.hasNext()) {
            return ikoacuggdj.eablkybsjg();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return ikoacuggdj.wkgbmnqykc(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }

    public static final Collection sopmlzcsov(btonecajqb btonecajqbVar, Collection destination) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(btonecajqbVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(destination, "destination");
        Iterator it = btonecajqbVar.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    public static btonecajqb stevsuqkhv(btonecajqb btonecajqbVar, tg.draadjrbmk transform) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(btonecajqbVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(transform, "transform");
        return wflxmlrfwp.yadqdtsiqt(new pmvmpeiblj(btonecajqbVar, transform));
    }

    public static btonecajqb tzroggbefp(btonecajqb btonecajqbVar, Object obj) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(btonecajqbVar, "<this>");
        return zdlpuopuiu.btonecajqb(wflxmlrfwp.kcexrzcfyt(btonecajqbVar, wflxmlrfwp.kcexrzcfyt(obj)));
    }

    public static btonecajqb ulzqkzuiru(btonecajqb btonecajqbVar, tg.draadjrbmk predicate) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(btonecajqbVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(predicate, "predicate");
        return new esjtqupxsv(btonecajqbVar, predicate);
    }

    public static btonecajqb wwaezpbzkn(btonecajqb btonecajqbVar, tg.draadjrbmk transform) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(btonecajqbVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(transform, "transform");
        return new nufgyqmvbu(btonecajqbVar, transform, ppxfxbqfkf.f62637zdlpuopuiu);
    }

    public static btonecajqb wypolnanlu(btonecajqb btonecajqbVar, tg.rgvfuqvkyq transform) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(btonecajqbVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(transform, "transform");
        return new lereixgezr(btonecajqbVar, transform);
    }

    public static btonecajqb yadqdtsiqt(btonecajqb btonecajqbVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(btonecajqbVar, "<this>");
        btonecajqb btonecajqbVarCdpycssgdh = wflxmlrfwp.cdpycssgdh(btonecajqbVar, new tg.draadjrbmk() { // from class: lj.jyumaefscl
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return Boolean.valueOf(cqumvgiudr.iozdgvuglv(obj));
            }
        });
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(btonecajqbVarCdpycssgdh, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return btonecajqbVarCdpycssgdh;
    }

    public static btonecajqb ylkuphrtab(btonecajqb btonecajqbVar, tg.draadjrbmk transform) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(btonecajqbVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(transform, "transform");
        return new nufgyqmvbu(btonecajqbVar, transform, zoijcleaow.f62640zdlpuopuiu);
    }

    public static btonecajqb zynmafqrjb(btonecajqb btonecajqbVar, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(btonecajqbVar, "<this>");
        if (i13 >= 0) {
            if (i13 == 0) {
                return btonecajqbVar;
            }
            return btonecajqbVar instanceof eablkybsjg ? ((eablkybsjg) btonecajqbVar).drop(i13) : new lj.wkgbmnqykc(btonecajqbVar, i13);
        }
        throw new IllegalArgumentException(("Requested element count " + i13 + " is less than zero.").toString());
    }
}
