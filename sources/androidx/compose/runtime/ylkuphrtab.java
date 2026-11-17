package androidx.compose.runtime;

/* JADX INFO: loaded from: classes.dex */
public abstract class ylkuphrtab {
    public static final boolean iobyxmoadg(jrbgnlbqoe jrbgnlbqoeVar, istkbnxepw istkbnxepwVar) {
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(istkbnxepwVar, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        return jrbgnlbqoeVar.containsKey(istkbnxepwVar);
    }

    public static final jrbgnlbqoe ppxfxbqfkf(b[] bVarArr, jrbgnlbqoe jrbgnlbqoeVar, jrbgnlbqoe jrbgnlbqoeVar2) {
        ezmngbhpjk.draadjrbmk.iobyxmoadg iobyxmoadgVarIwizpuwonk = ezmngbhpjk.wflxmlrfwp.iobyxmoadg().agtfadlqog();
        for (b bVar : bVarArr) {
            istkbnxepw istkbnxepwVarZoijcleaow = bVar.zoijcleaow();
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(istkbnxepwVarZoijcleaow, "null cannot be cast to non-null type androidx.compose.runtime.ProvidableCompositionLocal<kotlin.Any?>");
            a aVar = (a) istkbnxepwVarZoijcleaow;
            if (bVar.iobyxmoadg() || !iobyxmoadg(jrbgnlbqoeVar, aVar)) {
                n1 n1Var = (n1) jrbgnlbqoeVar2.get(aVar);
                kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(bVar, "null cannot be cast to non-null type androidx.compose.runtime.ProvidedValue<kotlin.Any?>");
                iobyxmoadgVarIwizpuwonk.put(aVar, aVar.zoijcleaow(bVar, n1Var));
            }
        }
        return iobyxmoadgVarIwizpuwonk.eablkybsjg();
    }

    public static /* synthetic */ jrbgnlbqoe wkgbmnqykc(b[] bVarArr, jrbgnlbqoe jrbgnlbqoeVar, jrbgnlbqoe jrbgnlbqoeVar2, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            jrbgnlbqoeVar2 = ezmngbhpjk.wflxmlrfwp.iobyxmoadg();
        }
        return ppxfxbqfkf(bVarArr, jrbgnlbqoeVar, jrbgnlbqoeVar2);
    }

    public static final Object zoijcleaow(jrbgnlbqoe jrbgnlbqoeVar, istkbnxepw istkbnxepwVar) {
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(istkbnxepwVar, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        Object objIobyxmoadg = jrbgnlbqoeVar.get(istkbnxepwVar);
        if (objIobyxmoadg == null) {
            objIobyxmoadg = istkbnxepwVar.iobyxmoadg();
        }
        return ((n1) objIobyxmoadg).iobyxmoadg(jrbgnlbqoeVar);
    }
}
