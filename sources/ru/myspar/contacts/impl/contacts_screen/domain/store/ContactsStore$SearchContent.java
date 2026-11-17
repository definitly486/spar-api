package ru.myspar.contacts.impl.contacts_screen.domain.store;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.actions.SearchIntents;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;
import ru.myspar.contacts.impl.contacts_screen.domain.model.ContactItem;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0007\bB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"ru/myspar/contacts/impl/contacts_screen/domain/store/ContactsStore$SearchContent", "Landroid/os/Parcelable;", "<init>", "()V", "Lru/myspar/contacts/impl/contacts_screen/domain/model/ContactItem;", "zoijcleaow", "()Lru/myspar/contacts/impl/contacts_screen/domain/model/ContactItem;", "Empty", "ContactList", "Lru/myspar/contacts/impl/contacts_screen/domain/store/ContactsStore$SearchContent$ContactList;", "Lru/myspar/contacts/impl/contacts_screen/domain/store/ContactsStore$SearchContent$Empty;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ContactsStore$SearchContent implements Parcelable {

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0015\u0010\u0016JL\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÇ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005H×\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bH×\u0001¢\u0006\u0004\b\u001b\u0010\u0016J\u001a\u0010\u001e\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH×\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R)\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00060"}, d2 = {"Lru/myspar/contacts/impl/contacts_screen/domain/store/ContactsStore$SearchContent$ContactList;", "Lru/myspar/contacts/impl/contacts_screen/domain/store/ContactsStore$SearchContent;", "", "isLoading", "", "", "", "Lru/myspar/contacts/impl/contacts_screen/domain/model/ContactItem;", "contacts", "Lp0/tzroggbefp;", SearchIntents.EXTRA_QUERY, "", "contactId", "<init>", "(ZLjava/util/Map;Lp0/tzroggbefp;Ljava/lang/Integer;)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "ppxfxbqfkf", "(ZLjava/util/Map;Lp0/tzroggbefp;Ljava/lang/Integer;)Lru/myspar/contacts/impl/contacts_screen/domain/store/ContactsStore$SearchContent$ContactList;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Z", "dxjokdxxww", "()Z", "yggfygwlhe", "Ljava/util/Map;", "lqeggnwhkg", "()Ljava/util/Map;", "jyumaefscl", "Lp0/tzroggbefp;", "nufgyqmvbu", "()Lp0/tzroggbefp;", "iwizpuwonk", "Ljava/lang/Integer;", "gxszxtbevo", "()Ljava/lang/Integer;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ContactList extends ContactsStore$SearchContent {
        public static final Parcelable.Creator<ContactList> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer contactId;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
        private final tzroggbefp query;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map contacts;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isLoading;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final ContactList createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                boolean z13 = parcel.readInt() != 0;
                int i13 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    String string = parcel.readString();
                    int i15 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i15);
                    for (int i16 = 0; i16 != i15; i16++) {
                        arrayList.add(ContactItem.CREATOR.createFromParcel(parcel));
                    }
                    linkedHashMap.put(string, arrayList);
                }
                return new ContactList(z13, linkedHashMap, et.iobyxmoadg.f31924iobyxmoadg.iobyxmoadg(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final ContactList[] newArray(int i13) {
                return new ContactList[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ContactList(boolean z13, Map contacts, tzroggbefp query, Integer num) {
            super(null);
            zdlpuopuiu.btonecajqb(contacts, "contacts");
            zdlpuopuiu.btonecajqb(query, "query");
            this.isLoading = z13;
            this.contacts = contacts;
            this.query = query;
            this.contactId = num;
        }

        public static /* synthetic */ ContactList eablkybsjg(ContactList contactList, boolean z13, Map map, tzroggbefp tzroggbefpVar, Integer num, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                z13 = contactList.isLoading;
            }
            if ((i13 & 2) != 0) {
                map = contactList.contacts;
            }
            if ((i13 & 4) != 0) {
                tzroggbefpVar = contactList.query;
            }
            if ((i13 & 8) != 0) {
                num = contactList.contactId;
            }
            return contactList.ppxfxbqfkf(z13, map, tzroggbefpVar, num);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContactList)) {
                return false;
            }
            ContactList contactList = (ContactList) other;
            return this.isLoading == contactList.isLoading && zdlpuopuiu.eablkybsjg(this.contacts, contactList.contacts) && zdlpuopuiu.eablkybsjg(this.query, contactList.query) && zdlpuopuiu.eablkybsjg(this.contactId, contactList.contactId);
        }

        /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
        public final Integer getContactId() {
            return this.contactId;
        }

        public int hashCode() {
            int iHashCode = ((((Boolean.hashCode(this.isLoading) * 31) + this.contacts.hashCode()) * 31) + this.query.hashCode()) * 31;
            Integer num = this.contactId;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
        public final Map getContacts() {
            return this.contacts;
        }

        /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
        public final tzroggbefp getQuery() {
            return this.query;
        }

        public final ContactList ppxfxbqfkf(boolean isLoading, Map contacts, tzroggbefp query, Integer contactId) {
            zdlpuopuiu.btonecajqb(contacts, "contacts");
            zdlpuopuiu.btonecajqb(query, "query");
            return new ContactList(isLoading, contacts, query, contactId);
        }

        public String toString() {
            return "ContactList(isLoading=" + this.isLoading + ", contacts=" + this.contacts + ", query=" + this.query + ", contactId=" + this.contactId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            int iIntValue;
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeInt(this.isLoading ? 1 : 0);
            Map map = this.contacts;
            dest.writeInt(map.size());
            for (Map.Entry entry : map.entrySet()) {
                dest.writeString((String) entry.getKey());
                List list = (List) entry.getValue();
                dest.writeInt(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((ContactItem) it.next()).writeToParcel(dest, flags);
                }
            }
            et.iobyxmoadg.f31924iobyxmoadg.zoijcleaow(this.query, dest, flags);
            Integer num = this.contactId;
            if (num == null) {
                iIntValue = 0;
            } else {
                dest.writeInt(1);
                iIntValue = num.intValue();
            }
            dest.writeInt(iIntValue);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006H×\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H×\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/myspar/contacts/impl/contacts_screen/domain/store/ContactsStore$SearchContent$Empty;", "Lru/myspar/contacts/impl/contacts_screen/domain/store/ContactsStore$SearchContent;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Empty extends ContactsStore$SearchContent {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final Empty f86419zdlpuopuiu = new Empty();
        public static final Parcelable.Creator<Empty> CREATOR = new iobyxmoadg();

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Empty createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                parcel.readInt();
                return Empty.f86419zdlpuopuiu;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Empty[] newArray(int i13) {
                return new Empty[i13];
            }
        }

        private Empty() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Empty);
        }

        public int hashCode() {
            return 412814955;
        }

        public String toString() {
            return "Empty";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeInt(1);
        }
    }

    public /* synthetic */ ContactsStore$SearchContent(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    public final ContactItem zoijcleaow() {
        Object obj = null;
        if (!(this instanceof ContactList)) {
            return null;
        }
        ContactList contactList = (ContactList) this;
        for (Object obj2 : jyumaefscl.lereixgezr(contactList.getContacts().values())) {
            int id2 = ((ContactItem) obj2).getId();
            Integer contactId = contactList.getContactId();
            if (contactId != null && id2 == contactId.intValue()) {
                obj = obj2;
                break;
            }
        }
        return (ContactItem) obj;
    }

    private ContactsStore$SearchContent() {
    }
}
