package ru.myspar.proloyalty.contacts.impl.contacts_screen.domain.store;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.contacts.api.model.ContactsScreenPayload;

/* JADX INFO: renamed from: ru.myspar.proloyalty.contacts.impl.contacts_screen.domain.store.ContactsStore$State, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J:\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÇ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018H×\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000eH×\u0001¢\u0006\u0004\b\u001b\u0010\u0014J\u001a\u0010\u001e\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH×\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00060"}, d2 = {"ru/myspar/proloyalty/contacts/impl/contacts_screen/domain/store/ContactsStore$State", "Landroid/os/Parcelable;", "Lru/myspar/proloyalty/contacts/api/model/ContactsScreenPayload;", "payload", "Lru/myspar/proloyalty/contacts/impl/contacts_screen/domain/store/ContactsStore$EditContact;", "editContact", "Lru/myspar/proloyalty/contacts/impl/contacts_screen/domain/store/ContactsStore$SearchContent;", "searchContent", "", "contactIsSending", "<init>", "(Lru/myspar/proloyalty/contacts/api/model/ContactsScreenPayload;Lru/myspar/proloyalty/contacts/impl/contacts_screen/domain/store/ContactsStore$EditContact;Lru/myspar/proloyalty/contacts/impl/contacts_screen/domain/store/ContactsStore$SearchContent;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/proloyalty/contacts/impl/contacts_screen/domain/store/ContactsStore$State;", "zoijcleaow", "(Lru/myspar/proloyalty/contacts/api/model/ContactsScreenPayload;Lru/myspar/proloyalty/contacts/impl/contacts_screen/domain/store/ContactsStore$EditContact;Lru/myspar/proloyalty/contacts/impl/contacts_screen/domain/store/ContactsStore$SearchContent;Z)Lru/myspar/proloyalty/contacts/impl/contacts_screen/domain/store/ContactsStore$State;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/proloyalty/contacts/api/model/ContactsScreenPayload;", "lqeggnwhkg", "()Lru/myspar/proloyalty/contacts/api/model/ContactsScreenPayload;", "yggfygwlhe", "Lru/myspar/proloyalty/contacts/impl/contacts_screen/domain/store/ContactsStore$EditContact;", "gxszxtbevo", "()Lru/myspar/proloyalty/contacts/impl/contacts_screen/domain/store/ContactsStore$EditContact;", "jyumaefscl", "Lru/myspar/proloyalty/contacts/impl/contacts_screen/domain/store/ContactsStore$SearchContent;", "nufgyqmvbu", "()Lru/myspar/proloyalty/contacts/impl/contacts_screen/domain/store/ContactsStore$SearchContent;", "iwizpuwonk", "Z", "eablkybsjg", "()Z", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean contactIsSending;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final ContactsStore$SearchContent searchContent;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final EditContact editContact;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final ContactsScreenPayload payload;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.contacts.impl.contacts_screen.domain.store.ContactsStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new State((ContactsScreenPayload) parcel.readParcelable(State.class.getClassLoader()), EditContact.CREATOR.createFromParcel(parcel), (ContactsStore$SearchContent) parcel.readParcelable(State.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(ContactsScreenPayload payload, EditContact editContact, ContactsStore$SearchContent contactsStore$SearchContent, boolean z13) {
        zdlpuopuiu.btonecajqb(payload, "payload");
        zdlpuopuiu.btonecajqb(editContact, "editContact");
        this.payload = payload;
        this.editContact = editContact;
        this.searchContent = contactsStore$SearchContent;
        this.contactIsSending = z13;
    }

    public static /* synthetic */ State ppxfxbqfkf(State state, ContactsScreenPayload contactsScreenPayload, EditContact editContact, ContactsStore$SearchContent contactsStore$SearchContent, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            contactsScreenPayload = state.payload;
        }
        if ((i13 & 2) != 0) {
            editContact = state.editContact;
        }
        if ((i13 & 4) != 0) {
            contactsStore$SearchContent = state.searchContent;
        }
        if ((i13 & 8) != 0) {
            z13 = state.contactIsSending;
        }
        return state.zoijcleaow(contactsScreenPayload, editContact, contactsStore$SearchContent, z13);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final boolean getContactIsSending() {
        return this.contactIsSending;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return zdlpuopuiu.eablkybsjg(this.payload, state.payload) && zdlpuopuiu.eablkybsjg(this.editContact, state.editContact) && zdlpuopuiu.eablkybsjg(this.searchContent, state.searchContent) && this.contactIsSending == state.contactIsSending;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final EditContact getEditContact() {
        return this.editContact;
    }

    public int hashCode() {
        int iHashCode = ((this.payload.hashCode() * 31) + this.editContact.hashCode()) * 31;
        ContactsStore$SearchContent contactsStore$SearchContent = this.searchContent;
        return ((iHashCode + (contactsStore$SearchContent == null ? 0 : contactsStore$SearchContent.hashCode())) * 31) + Boolean.hashCode(this.contactIsSending);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final ContactsScreenPayload getPayload() {
        return this.payload;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final ContactsStore$SearchContent getSearchContent() {
        return this.searchContent;
    }

    public String toString() {
        return "State(payload=" + this.payload + ", editContact=" + this.editContact + ", searchContent=" + this.searchContent + ", contactIsSending=" + this.contactIsSending + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeParcelable(this.payload, flags);
        this.editContact.writeToParcel(dest, flags);
        dest.writeParcelable(this.searchContent, flags);
        dest.writeInt(this.contactIsSending ? 1 : 0);
    }

    public final State zoijcleaow(ContactsScreenPayload payload, EditContact editContact, ContactsStore$SearchContent searchContent, boolean contactIsSending) {
        zdlpuopuiu.btonecajqb(payload, "payload");
        zdlpuopuiu.btonecajqb(editContact, "editContact");
        return new State(payload, editContact, searchContent, contactIsSending);
    }

    public /* synthetic */ State(ContactsScreenPayload contactsScreenPayload, EditContact editContact, ContactsStore$SearchContent contactsStore$SearchContent, boolean z13, int i13, gtknphoqwx gtknphoqwxVar) {
        this(contactsScreenPayload, editContact, (i13 & 4) != 0 ? null : contactsStore$SearchContent, (i13 & 8) != 0 ? false : z13);
    }
}
