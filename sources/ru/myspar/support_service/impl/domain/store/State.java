package ru.myspar.support_service.impl.domain.store;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.support_service.impl.domain.model.SupportInfo;

/* JADX INFO: renamed from: ru.myspar.support_service.impl.domain.store.SupportServiceStore$State, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001fB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H×\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bH×\u0001¢\u0006\u0004\b\u0015\u0010\u000eJ\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H×\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"ru/myspar/support_service/impl/domain/store/SupportServiceStore$State", "Landroid/os/Parcelable;", "Lru/myspar/support_service/impl/domain/store/SupportServiceStore$State$Content;", "content", "<init>", "(Lru/myspar/support_service/impl/domain/store/SupportServiceStore$State$Content;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/support_service/impl/domain/store/SupportServiceStore$State;", "zoijcleaow", "(Lru/myspar/support_service/impl/domain/store/SupportServiceStore$State$Content;)Lru/myspar/support_service/impl/domain/store/SupportServiceStore$State;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/support_service/impl/domain/store/SupportServiceStore$State$Content;", "ppxfxbqfkf", "()Lru/myspar/support_service/impl/domain/store/SupportServiceStore$State$Content;", "Content", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final Content content;

    /* JADX INFO: renamed from: ru.myspar.support_service.impl.domain.store.SupportServiceStore$State$Content */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/myspar/support_service/impl/domain/store/SupportServiceStore$State$Content;", "Landroid/os/Parcelable;", "<init>", "()V", "Error", "Success", "Lru/myspar/support_service/impl/domain/store/SupportServiceStore$State$Content$Error;", "Lru/myspar/support_service/impl/domain/store/SupportServiceStore$State$Content$Success;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Content implements Parcelable {

        /* JADX INFO: renamed from: ru.myspar.support_service.impl.domain.store.SupportServiceStore$State$Content$Error, reason: from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH×\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bH×\u0001¢\u0006\u0004\b\u0012\u0010\u000eJ\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H×\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/myspar/support_service/impl/domain/store/SupportServiceStore$State$Content$Error;", "Lru/myspar/support_service/impl/domain/store/SupportServiceStore$State$Content;", "", "isLoading", "<init>", "(Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Z", "zoijcleaow", "()Z", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error extends Content {
            public static final Parcelable.Creator<Error> CREATOR = new iobyxmoadg();

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isLoading;

            /* JADX INFO: renamed from: ru.myspar.support_service.impl.domain.store.SupportServiceStore$State$Content$Error$iobyxmoadg */
            public static final class iobyxmoadg implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
                public final Error createFromParcel(Parcel parcel) {
                    zdlpuopuiu.btonecajqb(parcel, "parcel");
                    return new Error(parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
                public final Error[] newArray(int i13) {
                    return new Error[i13];
                }
            }

            public Error(boolean z13) {
                super(null);
                this.isLoading = z13;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && this.isLoading == ((Error) other).isLoading;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isLoading);
            }

            public String toString() {
                return "Error(isLoading=" + this.isLoading + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                zdlpuopuiu.btonecajqb(dest, "dest");
                dest.writeInt(this.isLoading ? 1 : 0);
            }

            /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
            public final boolean getIsLoading() {
                return this.isLoading;
            }
        }

        /* JADX INFO: renamed from: ru.myspar.support_service.impl.domain.store.SupportServiceStore$State$Content$Success, reason: from toString */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH×\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bH×\u0001¢\u0006\u0004\b\u0012\u0010\u000eJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H×\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/myspar/support_service/impl/domain/store/SupportServiceStore$State$Content$Success;", "Lru/myspar/support_service/impl/domain/store/SupportServiceStore$State$Content;", "Lru/myspar/support_service/impl/domain/model/SupportInfo;", "info", "<init>", "(Lru/myspar/support_service/impl/domain/model/SupportInfo;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/support_service/impl/domain/model/SupportInfo;", "zoijcleaow", "()Lru/myspar/support_service/impl/domain/model/SupportInfo;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success extends Content {
            public static final Parcelable.Creator<Success> CREATOR = new iobyxmoadg();

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
            private final SupportInfo info;

            /* JADX INFO: renamed from: ru.myspar.support_service.impl.domain.store.SupportServiceStore$State$Content$Success$iobyxmoadg */
            public static final class iobyxmoadg implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
                public final Success createFromParcel(Parcel parcel) {
                    zdlpuopuiu.btonecajqb(parcel, "parcel");
                    return new Success(SupportInfo.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
                public final Success[] newArray(int i13) {
                    return new Success[i13];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(SupportInfo info) {
                super(null);
                zdlpuopuiu.btonecajqb(info, "info");
                this.info = info;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && zdlpuopuiu.eablkybsjg(this.info, ((Success) other).info);
            }

            public int hashCode() {
                return this.info.hashCode();
            }

            public String toString() {
                return "Success(info=" + this.info + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                zdlpuopuiu.btonecajqb(dest, "dest");
                this.info.writeToParcel(dest, flags);
            }

            /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
            public final SupportInfo getInfo() {
                return this.info;
            }
        }

        public /* synthetic */ Content(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private Content() {
        }
    }

    /* JADX INFO: renamed from: ru.myspar.support_service.impl.domain.store.SupportServiceStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new State((Content) parcel.readParcelable(State.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(Content content) {
        this.content = content;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof State) && zdlpuopuiu.eablkybsjg(this.content, ((State) other).content);
    }

    public int hashCode() {
        Content content = this.content;
        if (content == null) {
            return 0;
        }
        return content.hashCode();
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final Content getContent() {
        return this.content;
    }

    public String toString() {
        return "State(content=" + this.content + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeParcelable(this.content, flags);
    }

    public final State zoijcleaow(Content content) {
        return new State(content);
    }
}
