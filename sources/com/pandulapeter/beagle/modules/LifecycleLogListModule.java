package com.pandulapeter.beagle.modules;

import androidx.annotation.Keep;
import com.pandulapeter.beagle.common.configuration.Text;
import gg.gtknphoqwx;
import hg.agtfadlqog;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes2.dex */
public final class LifecycleLogListModule implements jf.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final draadjrbmk f25433eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f25434gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Text f25435iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final String f25436lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f25437ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f25438wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f25439zoijcleaow;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public static final ppxfxbqfkf f25432nufgyqmvbu = new ppxfxbqfkf(null);

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static final List f25431dxjokdxxww = agtfadlqog.i(EventType.values());

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private static final gtknphoqwx f25430btonecajqb = gg.draadjrbmk.zoijcleaow(zoijcleaow.f25441zdlpuopuiu);

    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/pandulapeter/beagle/modules/LifecycleLogListModule$EventType;", "", "formattedName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getFormattedName", "()Ljava/lang/String;", "ON_CREATE", "ON_START", "ON_RESUME", "ON_SAVE_INSTANCE_STATE", "ON_PAUSE", "ON_STOP", "ON_DESTROY", "FRAGMENT_ON_ATTACH", "FRAGMENT_ON_ACTIVITY_CREATED", "FRAGMENT_ON_VIEW_CREATED", "FRAGMENT_ON_VIEW_DESTROYED", "FRAGMENT_ON_DETACH", "internal-common_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum EventType {
        ON_CREATE("onCreate()"),
        ON_START("onStart()"),
        ON_RESUME("onResume()"),
        ON_SAVE_INSTANCE_STATE("onSaveInstanceState()"),
        ON_PAUSE("onPause()"),
        ON_STOP("onStop()"),
        ON_DESTROY("onDestroy()"),
        FRAGMENT_ON_ATTACH("onAttach()"),
        FRAGMENT_ON_ACTIVITY_CREATED("onActivityCreated()"),
        FRAGMENT_ON_VIEW_CREATED("onCreateView()"),
        FRAGMENT_ON_VIEW_DESTROYED("onDestroyView()"),
        FRAGMENT_ON_DETACH("onDetach()");

        private static final /* synthetic */ ng.iobyxmoadg $ENTRIES = ng.zoijcleaow.iobyxmoadg(values());
        private final String formattedName;

        EventType(String str) {
            this.formattedName = str;
        }

        public static ng.iobyxmoadg getEntries() {
            return $ENTRIES;
        }

        public final String getFormattedName() {
            return this.formattedName;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class iobyxmoadg extends jyumaefscl implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final iobyxmoadg f25440zdlpuopuiu = new iobyxmoadg();

        iobyxmoadg() {
            super(1);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return iobyxmoadg(((Number) obj).longValue());
        }

        public final String iobyxmoadg(long j13) {
            String str = LifecycleLogListModule.f25432nufgyqmvbu.zoijcleaow().format(Long.valueOf(j13));
            zdlpuopuiu.dxjokdxxww(str, "format(...)");
            return str;
        }
    }

    public static final class ppxfxbqfkf {
        public /* synthetic */ ppxfxbqfkf(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final SimpleDateFormat zoijcleaow() {
            return (SimpleDateFormat) LifecycleLogListModule.f25430btonecajqb.getValue();
        }

        private ppxfxbqfkf() {
        }
    }

    static final class zoijcleaow extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f25441zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final SimpleDateFormat invoke() {
            return new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH);
        }
    }

    public LifecycleLogListModule(Text title, List eventTypes, boolean z13, int i13, draadjrbmk draadjrbmkVar, boolean z14) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(eventTypes, "eventTypes");
        this.f25435iobyxmoadg = title;
        this.f25439zoijcleaow = eventTypes;
        this.f25437ppxfxbqfkf = z13;
        this.f25438wkgbmnqykc = i13;
        this.f25433eablkybsjg = draadjrbmkVar;
        this.f25434gxszxtbevo = z14;
        this.f25436lqeggnwhkg = "lifecycleLogList";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LifecycleLogListModule)) {
            return false;
        }
        LifecycleLogListModule lifecycleLogListModule = (LifecycleLogListModule) obj;
        return zdlpuopuiu.eablkybsjg(this.f25435iobyxmoadg, lifecycleLogListModule.f25435iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f25439zoijcleaow, lifecycleLogListModule.f25439zoijcleaow) && this.f25437ppxfxbqfkf == lifecycleLogListModule.f25437ppxfxbqfkf && this.f25438wkgbmnqykc == lifecycleLogListModule.f25438wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f25433eablkybsjg, lifecycleLogListModule.f25433eablkybsjg) && this.f25434gxszxtbevo == lifecycleLogListModule.f25434gxszxtbevo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((this.f25435iobyxmoadg.hashCode() * 31) + this.f25439zoijcleaow.hashCode()) * 31;
        boolean z13 = this.f25437ppxfxbqfkf;
        ?? r13 = z13;
        if (z13) {
            r13 = 1;
        }
        int iHashCode2 = (((iHashCode + r13) * 31) + Integer.hashCode(this.f25438wkgbmnqykc)) * 31;
        draadjrbmk draadjrbmkVar = this.f25433eablkybsjg;
        int iHashCode3 = (iHashCode2 + (draadjrbmkVar == null ? 0 : draadjrbmkVar.hashCode())) * 31;
        boolean z14 = this.f25434gxszxtbevo;
        return iHashCode3 + (z14 ? 1 : z14);
    }

    public String toString() {
        return "LifecycleLogListModule(title=" + this.f25435iobyxmoadg + ", eventTypes=" + this.f25439zoijcleaow + ", shouldDisplayFullNames=" + this.f25437ppxfxbqfkf + ", maxItemCount=" + this.f25438wkgbmnqykc + ", timestampFormatter=" + this.f25433eablkybsjg + ", isExpandedInitially=" + this.f25434gxszxtbevo + ")";
    }

    public /* synthetic */ LifecycleLogListModule(Text text, List list, boolean z13, int i13, draadjrbmk draadjrbmkVar, boolean z14, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? com.pandulapeter.beagle.common.configuration.ppxfxbqfkf.iobyxmoadg("Lifecycle logs") : text, (i14 & 2) != 0 ? f25431dxjokdxxww : list, (i14 & 4) != 0 ? false : z13, (i14 & 8) != 0 ? 20 : i13, (i14 & 16) != 0 ? iobyxmoadg.f25440zdlpuopuiu : draadjrbmkVar, (i14 & 32) == 0 ? z14 : false);
    }
}
