package z;

/* JADX INFO: loaded from: classes.dex */
public abstract class jztzpxfvev {

    static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ ipoelvxyzq.ppxfxbqfkf f127038zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar) {
            super(1);
            this.f127038zdlpuopuiu = ppxfxbqfkfVar;
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(androidx.compose.ui.wkgbmnqykc.zoijcleaow zoijcleaowVar) {
            this.f127038zdlpuopuiu.zoijcleaow(zoijcleaowVar);
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void eablkybsjg(ribwqtqdhb ribwqtqdhbVar, androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVar) {
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(ppxfxbqfkfVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
        ribwqtqdhbVar.draadjrbmk(ppxfxbqfkfVar);
    }

    public static final int ppxfxbqfkf(androidx.compose.ui.wkgbmnqykc.zoijcleaow zoijcleaowVar, androidx.compose.ui.wkgbmnqykc.zoijcleaow zoijcleaowVar2) {
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaowVar2)) {
            return 2;
        }
        return a.wkgbmnqykc.iobyxmoadg(zoijcleaowVar, zoijcleaowVar2) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ipoelvxyzq.ppxfxbqfkf wkgbmnqykc(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar, ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar2) {
        ppxfxbqfkfVar2.zoijcleaow(wkgbmnqykcVar);
        iobyxmoadg iobyxmoadgVar = null;
        while (ppxfxbqfkfVar2.draadjrbmk() != 0) {
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2 = (androidx.compose.ui.wkgbmnqykc) ppxfxbqfkfVar2.oxmwwwfdhm(ppxfxbqfkfVar2.draadjrbmk() - 1);
            if (wkgbmnqykcVar2 instanceof androidx.compose.ui.iobyxmoadg) {
                androidx.compose.ui.iobyxmoadg iobyxmoadgVar2 = (androidx.compose.ui.iobyxmoadg) wkgbmnqykcVar2;
                ppxfxbqfkfVar2.zoijcleaow(iobyxmoadgVar2.btonecajqb());
                ppxfxbqfkfVar2.zoijcleaow(iobyxmoadgVar2.draadjrbmk());
            } else if (wkgbmnqykcVar2 instanceof androidx.compose.ui.wkgbmnqykc.zoijcleaow) {
                ppxfxbqfkfVar.zoijcleaow(wkgbmnqykcVar2);
            } else {
                if (iobyxmoadgVar == null) {
                    iobyxmoadgVar = new iobyxmoadg(ppxfxbqfkfVar);
                }
                wkgbmnqykcVar2.zoijcleaow(iobyxmoadgVar);
                iobyxmoadgVar = iobyxmoadgVar;
            }
        }
        return ppxfxbqfkfVar;
    }
}
