package ru.myspar.videoplayer.impl.domain.store;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"ru/myspar/videoplayer/impl/domain/store/VideoPlayerStore$State", "Landroid/os/Parcelable;", "<init>", "()V", "Idle", "Lru/myspar/videoplayer/impl/domain/store/VideoPlayerStore$State$Idle;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class VideoPlayerStore$State implements Parcelable {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/myspar/videoplayer/impl/domain/store/VideoPlayerStore$State$Idle;", "Lru/myspar/videoplayer/impl/domain/store/VideoPlayerStore$State;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Idle extends VideoPlayerStore$State {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final Idle f104660zdlpuopuiu = new Idle();
        public static final Parcelable.Creator<Idle> CREATOR = new iobyxmoadg();

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Idle createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                parcel.readInt();
                return Idle.f104660zdlpuopuiu;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Idle[] newArray(int i13) {
                return new Idle[i13];
            }
        }

        private Idle() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeInt(1);
        }
    }

    public /* synthetic */ VideoPlayerStore$State(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private VideoPlayerStore$State() {
    }
}
