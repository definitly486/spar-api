package tj;

import pj.auzgnhcxok;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cqumvgiudr {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int ppxfxbqfkf(yggfygwlhe yggfygwlheVar, int i13, lg.btonecajqb.zoijcleaow zoijcleaowVar) {
        lg.btonecajqb.ppxfxbqfkf key = zoijcleaowVar.getKey();
        lg.btonecajqb.zoijcleaow zoijcleaowVar2 = yggfygwlheVar.f110715yggfygwlhe.get(key);
        if (key != auzgnhcxok.f76671gtknphoqwx) {
            if (zoijcleaowVar != zoijcleaowVar2) {
                return Integer.MIN_VALUE;
            }
            return i13 + 1;
        }
        auzgnhcxok auzgnhcxokVar = (auzgnhcxok) zoijcleaowVar2;
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(zoijcleaowVar, "null cannot be cast to non-null type kotlinx.coroutines.Job");
        auzgnhcxok auzgnhcxokVarWkgbmnqykc = wkgbmnqykc((auzgnhcxok) zoijcleaowVar, auzgnhcxokVar);
        if (auzgnhcxokVarWkgbmnqykc == auzgnhcxokVar) {
            return auzgnhcxokVar == null ? i13 : i13 + 1;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + auzgnhcxokVarWkgbmnqykc + ", expected child of " + auzgnhcxokVar + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }

    public static final auzgnhcxok wkgbmnqykc(auzgnhcxok auzgnhcxokVar, auzgnhcxok auzgnhcxokVar2) {
        while (auzgnhcxokVar != null) {
            if (auzgnhcxokVar == auzgnhcxokVar2 || !(auzgnhcxokVar instanceof uj.esjtqupxsv)) {
                return auzgnhcxokVar;
            }
            auzgnhcxokVar = ((uj.esjtqupxsv) auzgnhcxokVar).czzsidtyhn();
        }
        return null;
    }

    public static final void zoijcleaow(final yggfygwlhe yggfygwlheVar, lg.btonecajqb btonecajqbVar) {
        if (((Number) btonecajqbVar.fold(0, new tg.rgvfuqvkyq() { // from class: tj.iwizpuwonk
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(cqumvgiudr.ppxfxbqfkf(yggfygwlheVar, ((Integer) obj).intValue(), (lg.btonecajqb.zoijcleaow) obj2));
            }
        })).intValue() == yggfygwlheVar.f110714jyumaefscl) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + yggfygwlheVar.f110715yggfygwlhe + ",\n\t\tbut emission happened in " + btonecajqbVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }
}
