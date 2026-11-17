package ikoacuggdj;

/* JADX INFO: loaded from: classes.dex */
public final class ikoacuggdj {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long f44812iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final czzsidtyhn.ydmasvzmpa f44813zoijcleaow;

    public /* synthetic */ ikoacuggdj(long j13, czzsidtyhn.ydmasvzmpa ydmasvzmpaVar, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(j13, ydmasvzmpaVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ikoacuggdj.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        ikoacuggdj ikoacuggdjVar = (ikoacuggdj) obj;
        return h.oipsdeybqn.ojitshcjhn(this.f44812iobyxmoadg, ikoacuggdjVar.f44812iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f44813zoijcleaow, ikoacuggdjVar.f44813zoijcleaow);
    }

    public int hashCode() {
        return (h.oipsdeybqn.yggfygwlhe(this.f44812iobyxmoadg) * 31) + this.f44813zoijcleaow.hashCode();
    }

    public final czzsidtyhn.ydmasvzmpa iobyxmoadg() {
        return this.f44813zoijcleaow;
    }

    public String toString() {
        return "OverscrollConfiguration(glowColor=" + ((Object) h.oipsdeybqn.jyumaefscl(this.f44812iobyxmoadg)) + ", drawPadding=" + this.f44813zoijcleaow + ')';
    }

    public final long zoijcleaow() {
        return this.f44812iobyxmoadg;
    }

    private ikoacuggdj(long j13, czzsidtyhn.ydmasvzmpa ydmasvzmpaVar) {
        this.f44812iobyxmoadg = j13;
        this.f44813zoijcleaow = ydmasvzmpaVar;
    }

    public /* synthetic */ ikoacuggdj(long j13, czzsidtyhn.ydmasvzmpa ydmasvzmpaVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? h.bfopjjpdmp.ppxfxbqfkf(4284900966L) : j13, (i13 & 2) != 0 ? androidx.compose.foundation.layout.esjtqupxsv.lqeggnwhkg(0.0f, 0.0f, 3, null) : ydmasvzmpaVar, null);
    }
}
