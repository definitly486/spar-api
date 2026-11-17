package ru.myspar.proloyalty.contacts.impl.contacts_screen.domain.store;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import p0.tzroggbefp;

/* JADX INFO: renamed from: ru.myspar.proloyalty.contacts.impl.contacts_screen.domain.store.ContactsStore$EditContact, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0001.B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H×\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\tH×\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H×\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u001d\u0010(\u001a\u00020\u00198\u0006¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\u001d\u0010,\u001a\u00020\u00198\u0006¢\u0006\u0012\n\u0004\b)\u0010#\u0012\u0004\b+\u0010'\u001a\u0004\b*\u0010%¨\u0006/"}, d2 = {"ru/myspar/proloyalty/contacts/impl/contacts_screen/domain/store/ContactsStore$EditContact", "Landroid/os/Parcelable;", "Lp0/tzroggbefp;", ExternalMetricsManagerImpl.NAME, "phone", "<init>", "(Lp0/tzroggbefp;Lp0/tzroggbefp;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/proloyalty/contacts/impl/contacts_screen/domain/store/ContactsStore$EditContact;", "zoijcleaow", "(Lp0/tzroggbefp;Lp0/tzroggbefp;)Lru/myspar/proloyalty/contacts/impl/contacts_screen/domain/store/ContactsStore$EditContact;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lp0/tzroggbefp;", "eablkybsjg", "()Lp0/tzroggbefp;", "yggfygwlhe", "lqeggnwhkg", "jyumaefscl", "Z", "nufgyqmvbu", "()Z", "getPhoneIsValid$annotations", "()V", "phoneIsValid", "iwizpuwonk", "gxszxtbevo", "getNameIsValid$annotations", "nameIsValid", "cqumvgiudr", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EditContact implements Parcelable {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata */
    private final boolean nameIsValid;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata */
    private final boolean phoneIsValid;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final tzroggbefp phone;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final tzroggbefp name;
    public static final Parcelable.Creator<EditContact> CREATOR = new zoijcleaow();

    /* JADX INFO: renamed from: ru.myspar.proloyalty.contacts.impl.contacts_screen.domain.store.ContactsStore$EditContact$zoijcleaow */
    public static final class zoijcleaow implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final EditContact createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            yr0.iobyxmoadg iobyxmoadgVar = yr0.iobyxmoadg.f126300iobyxmoadg;
            return new EditContact(iobyxmoadgVar.iobyxmoadg(parcel), iobyxmoadgVar.iobyxmoadg(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final EditContact[] newArray(int i13) {
            return new EditContact[i13];
        }
    }

    public EditContact(tzroggbefp name, tzroggbefp phone) {
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(phone, "phone");
        this.name = name;
        this.phone = phone;
        boolean z13 = false;
        this.phoneIsValid = phone.draadjrbmk().length() > 0 && phone.draadjrbmk().length() == 11;
        if (name.draadjrbmk().length() > 0 && !TextUtils.isDigitsOnly(name.draadjrbmk())) {
            z13 = true;
        }
        this.nameIsValid = z13;
    }

    public static /* synthetic */ EditContact ppxfxbqfkf(EditContact editContact, tzroggbefp tzroggbefpVar, tzroggbefp tzroggbefpVar2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            tzroggbefpVar = editContact.name;
        }
        if ((i13 & 2) != 0) {
            tzroggbefpVar2 = editContact.phone;
        }
        return editContact.zoijcleaow(tzroggbefpVar, tzroggbefpVar2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final tzroggbefp getName() {
        return this.name;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EditContact)) {
            return false;
        }
        EditContact editContact = (EditContact) other;
        return zdlpuopuiu.eablkybsjg(this.name, editContact.name) && zdlpuopuiu.eablkybsjg(this.phone, editContact.phone);
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final boolean getNameIsValid() {
        return this.nameIsValid;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.phone.hashCode();
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final tzroggbefp getPhone() {
        return this.phone;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final boolean getPhoneIsValid() {
        return this.phoneIsValid;
    }

    public String toString() {
        return "EditContact(name=" + this.name + ", phone=" + this.phone + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        yr0.iobyxmoadg iobyxmoadgVar = yr0.iobyxmoadg.f126300iobyxmoadg;
        iobyxmoadgVar.zoijcleaow(this.name, dest, flags);
        iobyxmoadgVar.zoijcleaow(this.phone, dest, flags);
    }

    public final EditContact zoijcleaow(tzroggbefp name, tzroggbefp phone) {
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(phone, "phone");
        return new EditContact(name, phone);
    }
}
