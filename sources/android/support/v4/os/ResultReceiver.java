package android.support.v4.os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    android.support.v4.os.iobyxmoadg f2277jyumaefscl;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    final boolean f2279zdlpuopuiu = false;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    final Handler f2278yggfygwlhe = null;

    class iobyxmoadg implements Parcelable.Creator {
        iobyxmoadg() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public ResultReceiver[] newArray(int i13) {
            return new ResultReceiver[i13];
        }
    }

    class ppxfxbqfkf implements Runnable {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final Bundle f2281yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final int f2282zdlpuopuiu;

        ppxfxbqfkf(int i13, Bundle bundle) {
            this.f2282zdlpuopuiu = i13;
            this.f2281yggfygwlhe = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            ResultReceiver.this.zoijcleaow(this.f2282zdlpuopuiu, this.f2281yggfygwlhe);
        }
    }

    class zoijcleaow extends android.support.v4.os.iobyxmoadg.AbstractBinderC0061iobyxmoadg {
        zoijcleaow() {
        }

        @Override // android.support.v4.os.iobyxmoadg
        public void nufgyqmvbu(int i13, Bundle bundle) {
            ResultReceiver resultReceiver = ResultReceiver.this;
            Handler handler = resultReceiver.f2278yggfygwlhe;
            if (handler != null) {
                handler.post(resultReceiver.new ppxfxbqfkf(i13, bundle));
            } else {
                resultReceiver.zoijcleaow(i13, bundle);
            }
        }
    }

    ResultReceiver(Parcel parcel) {
        this.f2277jyumaefscl = android.support.v4.os.iobyxmoadg.AbstractBinderC0061iobyxmoadg.wflxmlrfwp(parcel.readStrongBinder());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i13) {
        synchronized (this) {
            try {
                if (this.f2277jyumaefscl == null) {
                    this.f2277jyumaefscl = new zoijcleaow();
                }
                parcel.writeStrongBinder(this.f2277jyumaefscl.asBinder());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected void zoijcleaow(int i13, Bundle bundle) {
    }
}
