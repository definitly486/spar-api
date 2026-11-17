package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u0000 \u0012*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u0001\u0013B\u001d\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableState;", "T", "Landroidx/compose/runtime/t0;", "Landroid/os/Parcelable;", "value", "Landroidx/compose/runtime/u0;", "policy", "<init>", "(Ljava/lang/Object;Landroidx/compose/runtime/u0;)V", "Landroid/os/Parcel;", "parcel", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "iwizpuwonk", "zoijcleaow", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
final class ParcelableSnapshotMutableState<T> extends t0 implements Parcelable {
    public static final Parcelable.Creator<ParcelableSnapshotMutableState<Object>> CREATOR = new iobyxmoadg();

    public static final class iobyxmoadg implements Parcelable.ClassLoaderCreator {
        iobyxmoadg() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableState createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableState[] newArray(int i13) {
            return new ParcelableSnapshotMutableState[i13];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            u0 u0VarDxjokdxxww;
            if (classLoader == null) {
                classLoader = iobyxmoadg.class.getClassLoader();
            }
            Object value = parcel.readValue(classLoader);
            int i13 = parcel.readInt();
            if (i13 == 0) {
                u0VarDxjokdxxww = v0.dxjokdxxww();
            } else if (i13 == 1) {
                u0VarDxjokdxxww = v0.rgvfuqvkyq();
            } else {
                if (i13 != 2) {
                    throw new IllegalStateException("Unsupported MutableState policy " + i13 + " was restored");
                }
                u0VarDxjokdxxww = v0.wflxmlrfwp();
            }
            return new ParcelableSnapshotMutableState(value, u0VarDxjokdxxww);
        }
    }

    public ParcelableSnapshotMutableState(Object obj, u0 u0Var) {
        super(obj, u0Var);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        int i13;
        parcel.writeValue(getValue());
        u0 u0VarEablkybsjg = eablkybsjg();
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(u0VarEablkybsjg, v0.dxjokdxxww())) {
            i13 = 0;
        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(u0VarEablkybsjg, v0.rgvfuqvkyq())) {
            i13 = 1;
        } else {
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(u0VarEablkybsjg, v0.wflxmlrfwp())) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i13 = 2;
        }
        parcel.writeInt(i13);
    }
}
