package zi;

/* JADX INFO: loaded from: classes3.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final wkgbmnqykc f130153iobyxmoadg = new wkgbmnqykc();

    private wkgbmnqykc() {
    }

    private final boolean iobyxmoadg(dj.ojitshcjhn ojitshcjhnVar, dj.btonecajqb btonecajqbVar, dj.btonecajqb btonecajqbVar2) {
        if (ojitshcjhnVar.tbqsvytpvh(btonecajqbVar) == ojitshcjhnVar.tbqsvytpvh(btonecajqbVar2) && ojitshcjhnVar.zfvoamnweg(btonecajqbVar) == ojitshcjhnVar.zfvoamnweg(btonecajqbVar2)) {
            if ((ojitshcjhnVar.dxjokdxxww(btonecajqbVar) == null) == (ojitshcjhnVar.dxjokdxxww(btonecajqbVar2) == null) && ojitshcjhnVar.auzgnhcxok(ojitshcjhnVar.iobyxmoadg(btonecajqbVar), ojitshcjhnVar.iobyxmoadg(btonecajqbVar2))) {
                if (ojitshcjhnVar.sopmlzcsov(btonecajqbVar, btonecajqbVar2)) {
                    return true;
                }
                int iTbqsvytpvh = ojitshcjhnVar.tbqsvytpvh(btonecajqbVar);
                for (int i13 = 0; i13 < iTbqsvytpvh; i13++) {
                    dj.draadjrbmk draadjrbmkVarNuxfzjnpeb = ojitshcjhnVar.nuxfzjnpeb(btonecajqbVar, i13);
                    dj.draadjrbmk draadjrbmkVarNuxfzjnpeb2 = ojitshcjhnVar.nuxfzjnpeb(btonecajqbVar2, i13);
                    if (ojitshcjhnVar.jhduphickx(draadjrbmkVarNuxfzjnpeb) != ojitshcjhnVar.jhduphickx(draadjrbmkVarNuxfzjnpeb2)) {
                        return false;
                    }
                    if (!ojitshcjhnVar.jhduphickx(draadjrbmkVarNuxfzjnpeb) && (ojitshcjhnVar.vipkmwdibw(draadjrbmkVarNuxfzjnpeb) != ojitshcjhnVar.vipkmwdibw(draadjrbmkVarNuxfzjnpeb2) || !ppxfxbqfkf(ojitshcjhnVar, ojitshcjhnVar.ojitshcjhn(draadjrbmkVarNuxfzjnpeb), ojitshcjhnVar.ojitshcjhn(draadjrbmkVarNuxfzjnpeb2)))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private final boolean ppxfxbqfkf(dj.ojitshcjhn ojitshcjhnVar, dj.dxjokdxxww dxjokdxxwwVar, dj.dxjokdxxww dxjokdxxwwVar2) {
        if (dxjokdxxwwVar == dxjokdxxwwVar2) {
            return true;
        }
        dj.btonecajqb btonecajqbVarGxszxtbevo = ojitshcjhnVar.gxszxtbevo(dxjokdxxwwVar);
        dj.btonecajqb btonecajqbVarGxszxtbevo2 = ojitshcjhnVar.gxszxtbevo(dxjokdxxwwVar2);
        if (btonecajqbVarGxszxtbevo != null && btonecajqbVarGxszxtbevo2 != null) {
            return iobyxmoadg(ojitshcjhnVar, btonecajqbVarGxszxtbevo, btonecajqbVarGxszxtbevo2);
        }
        dj.lqeggnwhkg lqeggnwhkgVarYadqdtsiqt = ojitshcjhnVar.yadqdtsiqt(dxjokdxxwwVar);
        dj.lqeggnwhkg lqeggnwhkgVarYadqdtsiqt2 = ojitshcjhnVar.yadqdtsiqt(dxjokdxxwwVar2);
        if (lqeggnwhkgVarYadqdtsiqt == null || lqeggnwhkgVarYadqdtsiqt2 == null) {
            return false;
        }
        return iobyxmoadg(ojitshcjhnVar, ojitshcjhnVar.lqeggnwhkg(lqeggnwhkgVarYadqdtsiqt), ojitshcjhnVar.lqeggnwhkg(lqeggnwhkgVarYadqdtsiqt2)) && iobyxmoadg(ojitshcjhnVar, ojitshcjhnVar.ppxfxbqfkf(lqeggnwhkgVarYadqdtsiqt), ojitshcjhnVar.ppxfxbqfkf(lqeggnwhkgVarYadqdtsiqt2));
    }

    public final boolean zoijcleaow(dj.ojitshcjhn context, dj.dxjokdxxww a13, dj.dxjokdxxww b13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(a13, "a");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(b13, "b");
        return ppxfxbqfkf(context, a13, b13);
    }
}
