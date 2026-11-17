package a8;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public interface lqeggnwhkg {

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ iobyxmoadg f1100iobyxmoadg = new iobyxmoadg();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private static final ppxfxbqfkf f1101zoijcleaow = new ppxfxbqfkf() { // from class: a8.gxszxtbevo
            @Override // a8.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj, Object obj2) {
                return lqeggnwhkg.iobyxmoadg.ppxfxbqfkf(obj, obj2);
            }
        };

        private iobyxmoadg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object ppxfxbqfkf(Object Reducer, Object it) {
            zdlpuopuiu.btonecajqb(Reducer, "$this$Reducer");
            zdlpuopuiu.btonecajqb(it, "it");
            return Reducer;
        }
    }

    public static final class zoijcleaow {
        public static /* synthetic */ eablkybsjg iobyxmoadg(lqeggnwhkg lqeggnwhkgVar, String str, boolean z13, Object obj, a8.iobyxmoadg iobyxmoadgVar, tg.iobyxmoadg iobyxmoadgVar2, ppxfxbqfkf ppxfxbqfkfVar, int i13, Object obj2) {
            ppxfxbqfkf ppxfxbqfkfVar2;
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
            }
            String str2 = (i13 & 1) != 0 ? null : str;
            boolean z14 = (i13 & 2) != 0 ? true : z13;
            a8.iobyxmoadg iobyxmoadgVar3 = (i13 & 8) != 0 ? null : iobyxmoadgVar;
            if ((i13 & 32) != 0) {
                ppxfxbqfkf ppxfxbqfkfVar3 = iobyxmoadg.f1101zoijcleaow;
                zdlpuopuiu.nufgyqmvbu(ppxfxbqfkfVar3, "null cannot be cast to non-null type com.arkivanov.mvikotlin.core.store.Reducer<State of com.arkivanov.mvikotlin.core.store.StoreFactory.create, kotlin.Any>");
                ppxfxbqfkfVar2 = ppxfxbqfkfVar3;
            } else {
                ppxfxbqfkfVar2 = ppxfxbqfkfVar;
            }
            return lqeggnwhkgVar.iobyxmoadg(str2, z14, obj, iobyxmoadgVar3, iobyxmoadgVar2, ppxfxbqfkfVar2);
        }
    }

    eablkybsjg iobyxmoadg(String str, boolean z13, Object obj, a8.iobyxmoadg iobyxmoadgVar, tg.iobyxmoadg iobyxmoadgVar2, ppxfxbqfkf ppxfxbqfkfVar);
}
