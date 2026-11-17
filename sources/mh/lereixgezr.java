package mh;

import zi.igdgnonuha;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lereixgezr implements jh.eablkybsjg {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public static final iobyxmoadg f67100zdlpuopuiu = new iobyxmoadg(null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final si.gtknphoqwx iobyxmoadg(jh.eablkybsjg eablkybsjgVar, igdgnonuha typeSubstitution, aj.lqeggnwhkg kotlinTypeRefiner) {
            si.gtknphoqwx gtknphoqwxVarMetgxyhuhe;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(eablkybsjgVar, "<this>");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(typeSubstitution, "typeSubstitution");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kotlinTypeRefiner, "kotlinTypeRefiner");
            lereixgezr lereixgezrVar = eablkybsjgVar instanceof lereixgezr ? (lereixgezr) eablkybsjgVar : null;
            if (lereixgezrVar != null && (gtknphoqwxVarMetgxyhuhe = lereixgezrVar.metgxyhuhe(typeSubstitution, kotlinTypeRefiner)) != null) {
                return gtknphoqwxVarMetgxyhuhe;
            }
            si.gtknphoqwx gtknphoqwxVarBfopjjpdmp = eablkybsjgVar.bfopjjpdmp(typeSubstitution);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(gtknphoqwxVarBfopjjpdmp, "getMemberScope(...)");
            return gtknphoqwxVarBfopjjpdmp;
        }

        public final si.gtknphoqwx zoijcleaow(jh.eablkybsjg eablkybsjgVar, aj.lqeggnwhkg kotlinTypeRefiner) {
            si.gtknphoqwx gtknphoqwxVarUawqvzlxes;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(eablkybsjgVar, "<this>");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kotlinTypeRefiner, "kotlinTypeRefiner");
            lereixgezr lereixgezrVar = eablkybsjgVar instanceof lereixgezr ? (lereixgezr) eablkybsjgVar : null;
            if (lereixgezrVar != null && (gtknphoqwxVarUawqvzlxes = lereixgezrVar.uawqvzlxes(kotlinTypeRefiner)) != null) {
                return gtknphoqwxVarUawqvzlxes;
            }
            si.gtknphoqwx gtknphoqwxVarNtlheqmsrt = eablkybsjgVar.ntlheqmsrt();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(gtknphoqwxVarNtlheqmsrt, "getUnsubstitutedMemberScope(...)");
            return gtknphoqwxVarNtlheqmsrt;
        }

        private iobyxmoadg() {
        }
    }

    protected abstract si.gtknphoqwx metgxyhuhe(igdgnonuha igdgnonuhaVar, aj.lqeggnwhkg lqeggnwhkgVar);

    protected abstract si.gtknphoqwx uawqvzlxes(aj.lqeggnwhkg lqeggnwhkgVar);
}
