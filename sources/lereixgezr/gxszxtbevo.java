package lereixgezr;

/* JADX INFO: loaded from: classes.dex */
final class gxszxtbevo extends ydmasvzmpa.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f62281iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ydmasvzmpa f62282zoijcleaow;

    gxszxtbevo(int i13, ydmasvzmpa ydmasvzmpaVar) {
        this.f62281iobyxmoadg = i13;
        if (ydmasvzmpaVar == null) {
            throw new NullPointerException("Null surfaceOutput");
        }
        this.f62282zoijcleaow = ydmasvzmpaVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ydmasvzmpa.zoijcleaow)) {
            return false;
        }
        ydmasvzmpa.zoijcleaow zoijcleaowVar = (ydmasvzmpa.zoijcleaow) obj;
        return this.f62281iobyxmoadg == zoijcleaowVar.iobyxmoadg() && this.f62282zoijcleaow.equals(zoijcleaowVar.zoijcleaow());
    }

    public int hashCode() {
        return ((this.f62281iobyxmoadg ^ 1000003) * 1000003) ^ this.f62282zoijcleaow.hashCode();
    }

    @Override // lereixgezr.ydmasvzmpa.zoijcleaow
    public int iobyxmoadg() {
        return this.f62281iobyxmoadg;
    }

    public String toString() {
        return "Event{eventCode=" + this.f62281iobyxmoadg + ", surfaceOutput=" + this.f62282zoijcleaow + "}";
    }

    @Override // lereixgezr.ydmasvzmpa.zoijcleaow
    public ydmasvzmpa zoijcleaow() {
        return this.f62282zoijcleaow;
    }
}
