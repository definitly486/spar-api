package zi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class stevsuqkhv implements zeieaojujs, dj.nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private kegysxyocb f130132iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f130133ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final LinkedHashSet f130134zoijcleaow;

    public static final class iobyxmoadg implements Comparator {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f130135zdlpuopuiu;

        public iobyxmoadg(tg.draadjrbmk draadjrbmkVar) {
            this.f130135zdlpuopuiu = draadjrbmkVar;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            kegysxyocb kegysxyocbVar = (kegysxyocb) obj;
            tg.draadjrbmk draadjrbmkVar = this.f130135zdlpuopuiu;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(kegysxyocbVar);
            String string = draadjrbmkVar.invoke(kegysxyocbVar).toString();
            kegysxyocb kegysxyocbVar2 = (kegysxyocb) obj2;
            tg.draadjrbmk draadjrbmkVar2 = this.f130135zdlpuopuiu;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(kegysxyocbVar2);
            return kg.iobyxmoadg.wkgbmnqykc(string, draadjrbmkVar2.invoke(kegysxyocbVar2).toString());
        }
    }

    public stevsuqkhv(Collection typesToIntersect) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(typesToIntersect, "typesToIntersect");
        typesToIntersect.isEmpty();
        LinkedHashSet linkedHashSet = new LinkedHashSet(typesToIntersect);
        this.f130134zoijcleaow = linkedHashSet;
        this.f130133ppxfxbqfkf = linkedHashSet.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ikoacuggdj gtknphoqwx(stevsuqkhv stevsuqkhvVar, aj.lqeggnwhkg kotlinTypeRefiner) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kotlinTypeRefiner, "kotlinTypeRefiner");
        return stevsuqkhvVar.iobyxmoadg(kotlinTypeRefiner).btonecajqb();
    }

    public static /* synthetic */ String ojitshcjhn(stevsuqkhv stevsuqkhvVar, tg.draadjrbmk draadjrbmkVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            draadjrbmkVar = dsvhmnatus.f130019zdlpuopuiu;
        }
        return stevsuqkhvVar.agtfadlqog(draadjrbmkVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String rgvfuqvkyq(kegysxyocb it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        return it.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence vdvldrhtss(tg.draadjrbmk draadjrbmkVar, kegysxyocb kegysxyocbVar) {
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(kegysxyocbVar);
        return draadjrbmkVar.invoke(kegysxyocbVar).toString();
    }

    public final String agtfadlqog(tg.draadjrbmk getProperTypeRelatedToStringify) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getProperTypeRelatedToStringify, "getProperTypeRelatedToStringify");
        return hg.jyumaefscl.iwxlajgraz(hg.jyumaefscl.d(this.f130134zoijcleaow, new iobyxmoadg(getProperTypeRelatedToStringify)), " & ", "{", "}", 0, null, new cllcsxoeiz(getProperTypeRelatedToStringify), 24, null);
    }

    public final ikoacuggdj btonecajqb() {
        return ntlheqmsrt.agtfadlqog(opjhrmiecq.f130109yggfygwlhe.btonecajqb(), this, hg.jyumaefscl.wflxmlrfwp(), false, dxjokdxxww(), new wypolnanlu(this));
    }

    public final kegysxyocb draadjrbmk() {
        return this.f130132iobyxmoadg;
    }

    public final si.gtknphoqwx dxjokdxxww() {
        return si.cqumvgiudr.f106706wkgbmnqykc.iobyxmoadg("member scope for intersection type", this.f130134zoijcleaow);
    }

    @Override // zi.zeieaojujs
    public boolean eablkybsjg() {
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof stevsuqkhv) {
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f130134zoijcleaow, ((stevsuqkhv) obj).f130134zoijcleaow);
        }
        return false;
    }

    @Override // zi.zeieaojujs
    public List getParameters() {
        return hg.jyumaefscl.wflxmlrfwp();
    }

    public int hashCode() {
        return this.f130133ppxfxbqfkf;
    }

    public final stevsuqkhv kcexrzcfyt(kegysxyocb kegysxyocbVar) {
        return new stevsuqkhv(this.f130134zoijcleaow, kegysxyocbVar);
    }

    @Override // zi.zeieaojujs
    /* JADX INFO: renamed from: oxmwwwfdhm, reason: merged with bridge method [inline-methods] */
    public stevsuqkhv iobyxmoadg(aj.lqeggnwhkg kotlinTypeRefiner) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kotlinTypeRefiner, "kotlinTypeRefiner");
        Collection collectionZoijcleaow = zoijcleaow();
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(collectionZoijcleaow, 10));
        Iterator it = collectionZoijcleaow.iterator();
        boolean z13 = false;
        while (it.hasNext()) {
            arrayList.add(((kegysxyocb) it.next()).ixidwrxhsl(kotlinTypeRefiner));
            z13 = true;
        }
        stevsuqkhv stevsuqkhvVarKcexrzcfyt = null;
        if (z13) {
            kegysxyocb kegysxyocbVarDraadjrbmk = draadjrbmk();
            stevsuqkhvVarKcexrzcfyt = new stevsuqkhv(arrayList).kcexrzcfyt(kegysxyocbVarDraadjrbmk != null ? kegysxyocbVarDraadjrbmk.ixidwrxhsl(kotlinTypeRefiner) : null);
        }
        return stevsuqkhvVarKcexrzcfyt == null ? this : stevsuqkhvVarKcexrzcfyt;
    }

    public String toString() {
        return ojitshcjhn(this, null, 1, null);
    }

    @Override // zi.zeieaojujs
    public gh.dxjokdxxww wflxmlrfwp() {
        gh.dxjokdxxww dxjokdxxwwVarWflxmlrfwp = ((kegysxyocb) this.f130134zoijcleaow.iterator().next()).grlcpdaxtj().wflxmlrfwp();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(dxjokdxxwwVarWflxmlrfwp, "getBuiltIns(...)");
        return dxjokdxxwwVarWflxmlrfwp;
    }

    @Override // zi.zeieaojujs
    public jh.nufgyqmvbu wkgbmnqykc() {
        return null;
    }

    @Override // zi.zeieaojujs
    public Collection zoijcleaow() {
        return this.f130134zoijcleaow;
    }

    private stevsuqkhv(Collection collection, kegysxyocb kegysxyocbVar) {
        this(collection);
        this.f130132iobyxmoadg = kegysxyocbVar;
    }
}
