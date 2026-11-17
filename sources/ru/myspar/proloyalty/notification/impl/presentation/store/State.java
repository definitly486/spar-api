package ru.myspar.proloyalty.notification.impl.presentation.store;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: renamed from: ru.myspar.proloyalty.notification.impl.presentation.store.NotificationStore$State, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001f B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H×\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bH×\u0001¢\u0006\u0004\b\u0015\u0010\u000eJ\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H×\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"ru/myspar/proloyalty/notification/impl/presentation/store/NotificationStore$State", "Landroid/os/Parcelable;", "Lru/myspar/proloyalty/notification/impl/presentation/store/NotificationStore$State$Content;", "content", "<init>", "(Lru/myspar/proloyalty/notification/impl/presentation/store/NotificationStore$State$Content;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/proloyalty/notification/impl/presentation/store/NotificationStore$State;", "zoijcleaow", "(Lru/myspar/proloyalty/notification/impl/presentation/store/NotificationStore$State$Content;)Lru/myspar/proloyalty/notification/impl/presentation/store/NotificationStore$State;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/proloyalty/notification/impl/presentation/store/NotificationStore$State$Content;", "ppxfxbqfkf", "()Lru/myspar/proloyalty/notification/impl/presentation/store/NotificationStore$State$Content;", "Content", "NotificationTypeHolder", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final Content content;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.notification.impl.presentation.store.NotificationStore$State$Content */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/myspar/proloyalty/notification/impl/presentation/store/NotificationStore$State$Content;", "Landroid/os/Parcelable;", "<init>", "()V", "NonAuth", "Notifications", "Lru/myspar/proloyalty/notification/impl/presentation/store/NotificationStore$State$Content$NonAuth;", "Lru/myspar/proloyalty/notification/impl/presentation/store/NotificationStore$State$Content$Notifications;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Content implements Parcelable {

        /* JADX INFO: renamed from: ru.myspar.proloyalty.notification.impl.presentation.store.NotificationStore$State$Content$NonAuth */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006H×\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H×\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/myspar/proloyalty/notification/impl/presentation/store/NotificationStore$State$Content$NonAuth;", "Lru/myspar/proloyalty/notification/impl/presentation/store/NotificationStore$State$Content;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class NonAuth extends Content {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            public static final NonAuth f98509zdlpuopuiu = new NonAuth();
            public static final Parcelable.Creator<NonAuth> CREATOR = new iobyxmoadg();

            /* JADX INFO: renamed from: ru.myspar.proloyalty.notification.impl.presentation.store.NotificationStore$State$Content$NonAuth$iobyxmoadg */
            public static final class iobyxmoadg implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
                public final NonAuth createFromParcel(Parcel parcel) {
                    zdlpuopuiu.btonecajqb(parcel, "parcel");
                    parcel.readInt();
                    return NonAuth.f98509zdlpuopuiu;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
                public final NonAuth[] newArray(int i13) {
                    return new NonAuth[i13];
                }
            }

            private NonAuth() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof NonAuth);
            }

            public int hashCode() {
                return 505242913;
            }

            public String toString() {
                return "NonAuth";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                zdlpuopuiu.btonecajqb(dest, "dest");
                dest.writeInt(1);
            }
        }

        /* JADX INFO: renamed from: ru.myspar.proloyalty.notification.impl.presentation.store.NotificationStore$State$Content$Notifications, reason: from toString */
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0011\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H×\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nH×\u0001¢\u0006\u0004\b\u0016\u0010\u0010J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H×\u0003¢\u0006\u0004\b\u001a\u0010\u001bR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/myspar/proloyalty/notification/impl/presentation/store/NotificationStore$State$Content$Notifications;", "Lru/myspar/proloyalty/notification/impl/presentation/store/NotificationStore$State$Content;", "", "Lb01/iobyxmoadg;", "Lru/myspar/proloyalty/notification/impl/presentation/store/NotificationStore$State$NotificationTypeHolder;", "notifications", "<init>", "(Ljava/util/Map;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "zoijcleaow", "(Ljava/util/Map;)Lru/myspar/proloyalty/notification/impl/presentation/store/NotificationStore$State$Content$Notifications;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/util/Map;", "ppxfxbqfkf", "()Ljava/util/Map;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Notifications extends Content {
            public static final Parcelable.Creator<Notifications> CREATOR = new iobyxmoadg();

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
            private final Map notifications;

            /* JADX INFO: renamed from: ru.myspar.proloyalty.notification.impl.presentation.store.NotificationStore$State$Content$Notifications$iobyxmoadg */
            public static final class iobyxmoadg implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
                public final Notifications createFromParcel(Parcel parcel) {
                    zdlpuopuiu.btonecajqb(parcel, "parcel");
                    int i13 = parcel.readInt();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(i13);
                    for (int i14 = 0; i14 != i13; i14++) {
                        linkedHashMap.put(b01.iobyxmoadg.valueOf(parcel.readString()), NotificationTypeHolder.CREATOR.createFromParcel(parcel));
                    }
                    return new Notifications(linkedHashMap);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
                public final Notifications[] newArray(int i13) {
                    return new Notifications[i13];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Notifications(Map notifications) {
                super(null);
                zdlpuopuiu.btonecajqb(notifications, "notifications");
                this.notifications = notifications;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Notifications) && zdlpuopuiu.eablkybsjg(this.notifications, ((Notifications) other).notifications);
            }

            public int hashCode() {
                return this.notifications.hashCode();
            }

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
            public final Map getNotifications() {
                return this.notifications;
            }

            public String toString() {
                return "Notifications(notifications=" + this.notifications + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                zdlpuopuiu.btonecajqb(dest, "dest");
                Map map = this.notifications;
                dest.writeInt(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    dest.writeString(((b01.iobyxmoadg) entry.getKey()).name());
                    ((NotificationTypeHolder) entry.getValue()).writeToParcel(dest, flags);
                }
            }

            public final Notifications zoijcleaow(Map notifications) {
                zdlpuopuiu.btonecajqb(notifications, "notifications");
                return new Notifications(notifications);
            }
        }

        public /* synthetic */ Content(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private Content() {
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.notification.impl.presentation.store.NotificationStore$State$NotificationTypeHolder, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H×\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000bH×\u0001¢\u0006\u0004\b\u0017\u0010\u0011J\u001a\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H×\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/myspar/proloyalty/notification/impl/presentation/store/NotificationStore$State$NotificationTypeHolder;", "Landroid/os/Parcelable;", "", "isRefreshing", "", "Lru/myspar/proloyalty/core/domain/models/push/NotificationModel;", "items", "<init>", "(ZLjava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "zoijcleaow", "(ZLjava/util/List;)Lru/myspar/proloyalty/notification/impl/presentation/store/NotificationStore$State$NotificationTypeHolder;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Z", "gxszxtbevo", "()Z", "yggfygwlhe", "Ljava/util/List;", "eablkybsjg", "()Ljava/util/List;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NotificationTypeHolder implements Parcelable {
        public static final Parcelable.Creator<NotificationTypeHolder> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final List items;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isRefreshing;

        /* JADX INFO: renamed from: ru.myspar.proloyalty.notification.impl.presentation.store.NotificationStore$State$NotificationTypeHolder$iobyxmoadg */
        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final NotificationTypeHolder createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                boolean z13 = parcel.readInt() != 0;
                int i13 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList.add(parcel.readParcelable(NotificationTypeHolder.class.getClassLoader()));
                }
                return new NotificationTypeHolder(z13, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final NotificationTypeHolder[] newArray(int i13) {
                return new NotificationTypeHolder[i13];
            }
        }

        public NotificationTypeHolder(boolean z13, List items) {
            zdlpuopuiu.btonecajqb(items, "items");
            this.isRefreshing = z13;
            this.items = items;
        }

        public static /* synthetic */ NotificationTypeHolder ppxfxbqfkf(NotificationTypeHolder notificationTypeHolder, boolean z13, List list, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                z13 = notificationTypeHolder.isRefreshing;
            }
            if ((i13 & 2) != 0) {
                list = notificationTypeHolder.items;
            }
            return notificationTypeHolder.zoijcleaow(z13, list);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
        public final List getItems() {
            return this.items;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NotificationTypeHolder)) {
                return false;
            }
            NotificationTypeHolder notificationTypeHolder = (NotificationTypeHolder) other;
            return this.isRefreshing == notificationTypeHolder.isRefreshing && zdlpuopuiu.eablkybsjg(this.items, notificationTypeHolder.items);
        }

        /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
        public final boolean getIsRefreshing() {
            return this.isRefreshing;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.isRefreshing) * 31) + this.items.hashCode();
        }

        public String toString() {
            return "NotificationTypeHolder(isRefreshing=" + this.isRefreshing + ", items=" + this.items + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeInt(this.isRefreshing ? 1 : 0);
            List list = this.items;
            dest.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable((Parcelable) it.next(), flags);
            }
        }

        public final NotificationTypeHolder zoijcleaow(boolean isRefreshing, List items) {
            zdlpuopuiu.btonecajqb(items, "items");
            return new NotificationTypeHolder(isRefreshing, items);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.notification.impl.presentation.store.NotificationStore$State$iobyxmoadg */
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
