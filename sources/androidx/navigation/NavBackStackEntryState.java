package androidx.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 .2\u00020\u0001:\u0001#B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ/\u0010\u0011\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010$\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0015R\u0019\u0010*\u001a\u0004\u0018\u00010%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010-\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010)¨\u0006/"}, d2 = {"Landroidx/navigation/NavBackStackEntryState;", "Landroid/os/Parcelable;", "Landroidx/navigation/ppxfxbqfkf;", "entry", "<init>", "(Landroidx/navigation/ppxfxbqfkf;)V", "Landroid/os/Parcel;", "inParcel", "(Landroid/os/Parcel;)V", "Landroid/content/Context;", "context", "Landroidx/navigation/lqeggnwhkg;", "destination", "Landroidx/lifecycle/gtknphoqwx$zoijcleaow;", "hostLifecycleState", "Landroidx/navigation/eablkybsjg;", "viewModel", "ppxfxbqfkf", "(Landroid/content/Context;Landroidx/navigation/lqeggnwhkg;Landroidx/lifecycle/gtknphoqwx$zoijcleaow;Landroidx/navigation/eablkybsjg;)Landroidx/navigation/ppxfxbqfkf;", "", "describeContents", "()I", "parcel", "i", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "zdlpuopuiu", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "yggfygwlhe", "I", "zoijcleaow", "destinationId", "Landroid/os/Bundle;", "jyumaefscl", "Landroid/os/Bundle;", "getArgs", "()Landroid/os/Bundle;", "args", "iwizpuwonk", "getSavedState", "savedState", "cqumvgiudr", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
public final class NavBackStackEntryState implements Parcelable {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata */
    private final Bundle savedState;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata */
    private final Bundle args;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata */
    private final int destinationId;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private final String id;
    public static final Parcelable.Creator<NavBackStackEntryState> CREATOR = new iobyxmoadg();

    public static final class iobyxmoadg implements Parcelable.Creator {
        iobyxmoadg() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public NavBackStackEntryState createFromParcel(Parcel inParcel) {
            zdlpuopuiu.btonecajqb(inParcel, "inParcel");
            return new NavBackStackEntryState(inParcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public NavBackStackEntryState[] newArray(int i13) {
            return new NavBackStackEntryState[i13];
        }
    }

    public NavBackStackEntryState(ppxfxbqfkf entry) {
        zdlpuopuiu.btonecajqb(entry, "entry");
        this.id = entry.gxszxtbevo();
        this.destinationId = entry.eablkybsjg().gtknphoqwx();
        this.args = entry.ppxfxbqfkf();
        Bundle bundle = new Bundle();
        this.savedState = bundle;
        entry.dxjokdxxww(bundle);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getId() {
        return this.id;
    }

    public final ppxfxbqfkf ppxfxbqfkf(Context context, lqeggnwhkg destination, androidx.lifecycle.gtknphoqwx.zoijcleaow hostLifecycleState, eablkybsjg viewModel) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(destination, "destination");
        zdlpuopuiu.btonecajqb(hostLifecycleState, "hostLifecycleState");
        Bundle bundle = this.args;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        return ppxfxbqfkf.f12220wwaezpbzkn.iobyxmoadg(context, destination, bundle, hostLifecycleState, viewModel, this.id, this.savedState);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i13) {
        zdlpuopuiu.btonecajqb(parcel, "parcel");
        parcel.writeString(this.id);
        parcel.writeInt(this.destinationId);
        parcel.writeBundle(this.args);
        parcel.writeBundle(this.savedState);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final int getDestinationId() {
        return this.destinationId;
    }

    public NavBackStackEntryState(Parcel inParcel) {
        zdlpuopuiu.btonecajqb(inParcel, "inParcel");
        String string = inParcel.readString();
        zdlpuopuiu.lqeggnwhkg(string);
        this.id = string;
        this.destinationId = inParcel.readInt();
        this.args = inParcel.readBundle(NavBackStackEntryState.class.getClassLoader());
        Bundle bundle = inParcel.readBundle(NavBackStackEntryState.class.getClassLoader());
        zdlpuopuiu.lqeggnwhkg(bundle);
        this.savedState = bundle;
    }
}
