package androidx.compose.ui.platform;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a2\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a>\u0010\t\u001a\u00020\u0006*\u00020\u00062\u0014\b\b\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0000H\u0087\b¢\u0006\u0004\b\t\u0010\n\u001a/\u0010\f\u001a\u00020\u0006*\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\f\u0010\r\"#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/platform/ixidwrxhsl;", "Lgg/wwaezpbzkn;", "definitions", "debugInspectorInfo", "(Ltg/draadjrbmk;)Ltg/draadjrbmk;", "Landroidx/compose/ui/wkgbmnqykc;", "inspectorInfo", "factory", "inspectable", "(Landroidx/compose/ui/wkgbmnqykc;Ltg/draadjrbmk;Ltg/draadjrbmk;)Landroidx/compose/ui/wkgbmnqykc;", "wrapped", "inspectableWrapper", "(Landroidx/compose/ui/wkgbmnqykc;Ltg/draadjrbmk;Landroidx/compose/ui/wkgbmnqykc;)Landroidx/compose/ui/wkgbmnqykc;", "NoInspectorInfo", "Ltg/draadjrbmk;", "getNoInspectorInfo", "()Ltg/draadjrbmk;", "", "isDebugInspectorInfoEnabled", "Z", "()Z", "setDebugInspectorInfoEnabled", "(Z)V", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class InspectableValueKt {
    private static final tg.draadjrbmk NoInspectorInfo = iobyxmoadg.f6753zdlpuopuiu;
    private static boolean isDebugInspectorInfoEnabled;

    static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final iobyxmoadg f6753zdlpuopuiu = new iobyxmoadg();

        iobyxmoadg() {
            super(1);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            androidx.appcompat.app.yggfygwlhe.iobyxmoadg(obj);
            iobyxmoadg(null);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(ixidwrxhsl ixidwrxhslVar) {
        }
    }

    public static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f6754zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(tg.draadjrbmk draadjrbmkVar) {
            super(1);
            this.f6754zdlpuopuiu = draadjrbmkVar;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            androidx.appcompat.app.yggfygwlhe.iobyxmoadg(obj);
            iobyxmoadg(null);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(ixidwrxhsl ixidwrxhslVar) {
            this.f6754zdlpuopuiu.invoke(ixidwrxhslVar);
        }
    }

    public static final tg.draadjrbmk debugInspectorInfo(tg.draadjrbmk draadjrbmkVar) {
        return isDebugInspectorInfoEnabled() ? new zoijcleaow(draadjrbmkVar) : getNoInspectorInfo();
    }

    public static final tg.draadjrbmk getNoInspectorInfo() {
        return NoInspectorInfo;
    }

    @gg.eablkybsjg
    public static final androidx.compose.ui.wkgbmnqykc inspectable(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, tg.draadjrbmk draadjrbmkVar, tg.draadjrbmk draadjrbmkVar2) {
        return inspectableWrapper(wkgbmnqykcVar, draadjrbmkVar, (androidx.compose.ui.wkgbmnqykc) draadjrbmkVar2.invoke(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg));
    }

    public static final androidx.compose.ui.wkgbmnqykc inspectableWrapper(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, tg.draadjrbmk draadjrbmkVar, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2) {
        grlcpdaxtj grlcpdaxtjVar = new grlcpdaxtj(draadjrbmkVar);
        return wkgbmnqykcVar.eablkybsjg(grlcpdaxtjVar).eablkybsjg(wkgbmnqykcVar2).eablkybsjg(grlcpdaxtjVar.btonecajqb());
    }

    public static final boolean isDebugInspectorInfoEnabled() {
        return isDebugInspectorInfoEnabled;
    }

    public static final void setDebugInspectorInfoEnabled(boolean z13) {
        isDebugInspectorInfoEnabled = z13;
    }
}
