package ru.myspar.user.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Scopes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import ma0.eablkybsjg;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b.\b\u0087\b\u0018\u00002\u00020\u0001BÅ\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0017\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J\u001d\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0013¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u0013¢\u0006\u0004\b(\u0010)Jø\u0001\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00132\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00172\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00172\b\b\u0002\u0010\u001f\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b.\u0010)J\u001a\u00101\u001a\u00020\u000e2\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b1\u00102R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010-R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u00104\u001a\u0004\b7\u0010-R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u00104\u001a\u0004\b9\u0010-R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u00104\u001a\u0004\b:\u0010-R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u00104\u001a\u0004\b<\u0010-R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bA\u00104\u001a\u0004\bB\u0010-R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bC\u00104\u001a\u0004\bD\u0010-R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bM\u0010J\u001a\u0004\bN\u0010LR\u0017\u0010\u0011\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bN\u0010J\u001a\u0004\bO\u0010LR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bP\u0010J\u001a\u0004\bQ\u0010LR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\b6\u0010)R\u0017\u0010\u0015\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b?\u0010S\u001a\u0004\bT\u0010)R\u0017\u0010\u0016\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bU\u0010S\u001a\u0004\b=\u0010)R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bR\u0010XR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b5\u0010Y\u001a\u0004\bV\u0010ZR\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00178\u0006¢\u0006\f\n\u0004\bO\u0010W\u001a\u0004\bU\u0010XR\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00178\u0006¢\u0006\f\n\u0004\b[\u0010W\u001a\u0004\bP\u0010XR\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bK\u00104\u001a\u0004\b\\\u0010-¨\u0006]"}, d2 = {"Lru/myspar/user/models/User;", "Landroid/os/Parcelable;", "", "xmlId", "phone", Scopes.EMAIL, "firstName", "lastName", "Lru/myspar/user/models/UserCard;", "userCard", "gender", "dateBirth", "Lru/myspar/user/models/UserNotifications;", "notifications", "", "isIqosAgreementsApplied", "scanGoAccessGranted", "isEmailConfirmed", "digitalChecks", "", "notificationsNew", "discountsNew", "promoNew", "", "Lma0/eablkybsjg;", "testerFunctions", "", "verifySum", "Lru/myspar/user/models/UserSubscription;", "userSubscriptions", "segments", "gameToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/myspar/user/models/UserCard;Ljava/lang/String;Ljava/lang/String;Lru/myspar/user/models/UserNotifications;ZZZZIIILjava/util/List;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "zoijcleaow", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/myspar/user/models/UserCard;Ljava/lang/String;Ljava/lang/String;Lru/myspar/user/models/UserNotifications;ZZZZIIILjava/util/List;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Lru/myspar/user/models/User;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "hcddaimhww", "yggfygwlhe", "iwizpuwonk", "jyumaefscl", "nufgyqmvbu", "dxjokdxxww", "cqumvgiudr", "wflxmlrfwp", "esjtqupxsv", "Lru/myspar/user/models/UserCard;", "wwaezpbzkn", "()Lru/myspar/user/models/UserCard;", "lereixgezr", "gtknphoqwx", "pmvmpeiblj", "eablkybsjg", "zynmafqrjb", "Lru/myspar/user/models/UserNotifications;", "oxmwwwfdhm", "()Lru/myspar/user/models/UserNotifications;", "istkbnxepw", "Z", "cllcsxoeiz", "()Z", "cdpycssgdh", "yadqdtsiqt", "jpowsppfya", "iozdgvuglv", "gxszxtbevo", "lmojexxdyd", "I", "lqeggnwhkg", "ylkuphrtab", "pkzmftpjix", "Ljava/util/List;", "()Ljava/util/List;", "Ljava/lang/Double;", "()Ljava/lang/Double;", "hkdspvbjdz", "btonecajqb", "user_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class User implements Parcelable {
    public static final Parcelable.Creator<User> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean scanGoAccessGranted;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name and from kotlin metadata and from toString */
    private final String gameToken;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String lastName;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final UserCard userCard;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double verifySum;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name and from kotlin metadata and from toString */
    private final List segments;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean digitalChecks;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isIqosAgreementsApplied;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String firstName;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name and from kotlin metadata and from toString */
    private final List userSubscriptions;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String email;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String gender;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata and from toString */
    private final int notificationsNew;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name and from kotlin metadata and from toString */
    private final List testerFunctions;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final String dateBirth;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata and from toString */
    private final int discountsNew;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isEmailConfirmed;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String phone;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name and from kotlin metadata and from toString */
    private final int promoNew;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String xmlId;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final UserNotifications notifications;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final User createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            UserCard userCardCreateFromParcel = UserCard.CREATOR.createFromParcel(parcel);
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            UserNotifications userNotificationsCreateFromParcel = UserNotifications.CREATOR.createFromParcel(parcel);
            boolean z13 = parcel.readInt() != 0;
            boolean z14 = parcel.readInt() != 0;
            boolean z15 = parcel.readInt() != 0;
            boolean z16 = parcel.readInt() != 0;
            int i13 = parcel.readInt();
            int i14 = parcel.readInt();
            int i15 = parcel.readInt();
            int i16 = parcel.readInt();
            boolean z17 = z16;
            ArrayList arrayList = new ArrayList(i16);
            int i17 = 0;
            while (i17 != i16) {
                arrayList.add(eablkybsjg.valueOf(parcel.readString()));
                i17++;
                i16 = i16;
            }
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            int i18 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i18);
            int i19 = 0;
            while (i19 != i18) {
                arrayList2.add(UserSubscription.CREATOR.createFromParcel(parcel));
                i19++;
                i18 = i18;
            }
            return new User(string, string2, string3, string4, string5, userCardCreateFromParcel, string6, string7, userNotificationsCreateFromParcel, z13, z14, z15, z17, i13, i14, i15, arrayList, dValueOf, arrayList2, parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final User[] newArray(int i13) {
            return new User[i13];
        }
    }

    public User(String str, String phone, String email, String firstName, String lastName, UserCard userCard, String gender, String dateBirth, UserNotifications notifications, boolean z13, boolean z14, boolean z15, boolean z16, int i13, int i14, int i15, List testerFunctions, Double d13, List userSubscriptions, List segments, String gameToken) {
        zdlpuopuiu.btonecajqb(phone, "phone");
        zdlpuopuiu.btonecajqb(email, "email");
        zdlpuopuiu.btonecajqb(firstName, "firstName");
        zdlpuopuiu.btonecajqb(lastName, "lastName");
        zdlpuopuiu.btonecajqb(userCard, "userCard");
        zdlpuopuiu.btonecajqb(gender, "gender");
        zdlpuopuiu.btonecajqb(dateBirth, "dateBirth");
        zdlpuopuiu.btonecajqb(notifications, "notifications");
        zdlpuopuiu.btonecajqb(testerFunctions, "testerFunctions");
        zdlpuopuiu.btonecajqb(userSubscriptions, "userSubscriptions");
        zdlpuopuiu.btonecajqb(segments, "segments");
        zdlpuopuiu.btonecajqb(gameToken, "gameToken");
        this.xmlId = str;
        this.phone = phone;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userCard = userCard;
        this.gender = gender;
        this.dateBirth = dateBirth;
        this.notifications = notifications;
        this.isIqosAgreementsApplied = z13;
        this.scanGoAccessGranted = z14;
        this.isEmailConfirmed = z15;
        this.digitalChecks = z16;
        this.notificationsNew = i13;
        this.discountsNew = i14;
        this.promoNew = i15;
        this.testerFunctions = testerFunctions;
        this.verifySum = d13;
        this.userSubscriptions = userSubscriptions;
        this.segments = segments;
        this.gameToken = gameToken;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final String getGameToken() {
        return this.gameToken;
    }

    /* JADX INFO: renamed from: cllcsxoeiz, reason: from getter */
    public final boolean getIsIqosAgreementsApplied() {
        return this.isIqosAgreementsApplied;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getDateBirth() {
        return this.dateBirth;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof User)) {
            return false;
        }
        User user = (User) other;
        return zdlpuopuiu.eablkybsjg(this.xmlId, user.xmlId) && zdlpuopuiu.eablkybsjg(this.phone, user.phone) && zdlpuopuiu.eablkybsjg(this.email, user.email) && zdlpuopuiu.eablkybsjg(this.firstName, user.firstName) && zdlpuopuiu.eablkybsjg(this.lastName, user.lastName) && zdlpuopuiu.eablkybsjg(this.userCard, user.userCard) && zdlpuopuiu.eablkybsjg(this.gender, user.gender) && zdlpuopuiu.eablkybsjg(this.dateBirth, user.dateBirth) && zdlpuopuiu.eablkybsjg(this.notifications, user.notifications) && this.isIqosAgreementsApplied == user.isIqosAgreementsApplied && this.scanGoAccessGranted == user.scanGoAccessGranted && this.isEmailConfirmed == user.isEmailConfirmed && this.digitalChecks == user.digitalChecks && this.notificationsNew == user.notificationsNew && this.discountsNew == user.discountsNew && this.promoNew == user.promoNew && zdlpuopuiu.eablkybsjg(this.testerFunctions, user.testerFunctions) && zdlpuopuiu.eablkybsjg(this.verifySum, user.verifySum) && zdlpuopuiu.eablkybsjg(this.userSubscriptions, user.userSubscriptions) && zdlpuopuiu.eablkybsjg(this.segments, user.segments) && zdlpuopuiu.eablkybsjg(this.gameToken, user.gameToken);
    }

    /* JADX INFO: renamed from: esjtqupxsv, reason: from getter */
    public final int getPromoNew() {
        return this.promoNew;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final String getGender() {
        return this.gender;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final boolean getDigitalChecks() {
        return this.digitalChecks;
    }

    public int hashCode() {
        String str = this.xmlId;
        int iHashCode = (((((((((((((((((((((((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.phone.hashCode()) * 31) + this.email.hashCode()) * 31) + this.firstName.hashCode()) * 31) + this.lastName.hashCode()) * 31) + this.userCard.hashCode()) * 31) + this.gender.hashCode()) * 31) + this.dateBirth.hashCode()) * 31) + this.notifications.hashCode()) * 31) + Boolean.hashCode(this.isIqosAgreementsApplied)) * 31) + Boolean.hashCode(this.scanGoAccessGranted)) * 31) + Boolean.hashCode(this.isEmailConfirmed)) * 31) + Boolean.hashCode(this.digitalChecks)) * 31) + Integer.hashCode(this.notificationsNew)) * 31) + Integer.hashCode(this.discountsNew)) * 31) + Integer.hashCode(this.promoNew)) * 31) + this.testerFunctions.hashCode()) * 31;
        Double d13 = this.verifySum;
        return ((((((iHashCode + (d13 != null ? d13.hashCode() : 0)) * 31) + this.userSubscriptions.hashCode()) * 31) + this.segments.hashCode()) * 31) + this.gameToken.hashCode();
    }

    /* JADX INFO: renamed from: hcddaimhww, reason: from getter */
    public final String getXmlId() {
        return this.xmlId;
    }

    /* JADX INFO: renamed from: iozdgvuglv, reason: from getter */
    public final List getSegments() {
        return this.segments;
    }

    /* JADX INFO: renamed from: iwizpuwonk, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* JADX INFO: renamed from: jpowsppfya, reason: from getter */
    public final boolean getIsEmailConfirmed() {
        return this.isEmailConfirmed;
    }

    /* JADX INFO: renamed from: lmojexxdyd, reason: from getter */
    public final List getTesterFunctions() {
        return this.testerFunctions;
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final int getDiscountsNew() {
        return this.discountsNew;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: from getter */
    public final UserNotifications getNotifications() {
        return this.notifications;
    }

    /* JADX INFO: renamed from: pkzmftpjix, reason: from getter */
    public final Double getVerifySum() {
        return this.verifySum;
    }

    public String toString() {
        return "User(xmlId=" + this.xmlId + ", phone=" + this.phone + ", email=" + this.email + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", userCard=" + this.userCard + ", gender=" + this.gender + ", dateBirth=" + this.dateBirth + ", notifications=" + this.notifications + ", isIqosAgreementsApplied=" + this.isIqosAgreementsApplied + ", scanGoAccessGranted=" + this.scanGoAccessGranted + ", isEmailConfirmed=" + this.isEmailConfirmed + ", digitalChecks=" + this.digitalChecks + ", notificationsNew=" + this.notificationsNew + ", discountsNew=" + this.discountsNew + ", promoNew=" + this.promoNew + ", testerFunctions=" + this.testerFunctions + ", verifySum=" + this.verifySum + ", userSubscriptions=" + this.userSubscriptions + ", segments=" + this.segments + ", gameToken=" + this.gameToken + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.xmlId);
        dest.writeString(this.phone);
        dest.writeString(this.email);
        dest.writeString(this.firstName);
        dest.writeString(this.lastName);
        this.userCard.writeToParcel(dest, flags);
        dest.writeString(this.gender);
        dest.writeString(this.dateBirth);
        this.notifications.writeToParcel(dest, flags);
        dest.writeInt(this.isIqosAgreementsApplied ? 1 : 0);
        dest.writeInt(this.scanGoAccessGranted ? 1 : 0);
        dest.writeInt(this.isEmailConfirmed ? 1 : 0);
        dest.writeInt(this.digitalChecks ? 1 : 0);
        dest.writeInt(this.notificationsNew);
        dest.writeInt(this.discountsNew);
        dest.writeInt(this.promoNew);
        List list = this.testerFunctions;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dest.writeString(((eablkybsjg) it.next()).name());
        }
        Double d13 = this.verifySum;
        if (d13 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d13.doubleValue());
        }
        List list2 = this.userSubscriptions;
        dest.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            ((UserSubscription) it2.next()).writeToParcel(dest, flags);
        }
        dest.writeStringList(this.segments);
        dest.writeString(this.gameToken);
    }

    /* JADX INFO: renamed from: wwaezpbzkn, reason: from getter */
    public final UserCard getUserCard() {
        return this.userCard;
    }

    /* JADX INFO: renamed from: yadqdtsiqt, reason: from getter */
    public final boolean getScanGoAccessGranted() {
        return this.scanGoAccessGranted;
    }

    /* JADX INFO: renamed from: yggfygwlhe, reason: from getter */
    public final int getNotificationsNew() {
        return this.notificationsNew;
    }

    /* JADX INFO: renamed from: ylkuphrtab, reason: from getter */
    public final List getUserSubscriptions() {
        return this.userSubscriptions;
    }

    public final User zoijcleaow(String xmlId, String phone, String email, String firstName, String lastName, UserCard userCard, String gender, String dateBirth, UserNotifications notifications, boolean isIqosAgreementsApplied, boolean scanGoAccessGranted, boolean isEmailConfirmed, boolean digitalChecks, int notificationsNew, int discountsNew, int promoNew, List testerFunctions, Double verifySum, List userSubscriptions, List segments, String gameToken) {
        zdlpuopuiu.btonecajqb(phone, "phone");
        zdlpuopuiu.btonecajqb(email, "email");
        zdlpuopuiu.btonecajqb(firstName, "firstName");
        zdlpuopuiu.btonecajqb(lastName, "lastName");
        zdlpuopuiu.btonecajqb(userCard, "userCard");
        zdlpuopuiu.btonecajqb(gender, "gender");
        zdlpuopuiu.btonecajqb(dateBirth, "dateBirth");
        zdlpuopuiu.btonecajqb(notifications, "notifications");
        zdlpuopuiu.btonecajqb(testerFunctions, "testerFunctions");
        zdlpuopuiu.btonecajqb(userSubscriptions, "userSubscriptions");
        zdlpuopuiu.btonecajqb(segments, "segments");
        zdlpuopuiu.btonecajqb(gameToken, "gameToken");
        return new User(xmlId, phone, email, firstName, lastName, userCard, gender, dateBirth, notifications, isIqosAgreementsApplied, scanGoAccessGranted, isEmailConfirmed, digitalChecks, notificationsNew, discountsNew, promoNew, testerFunctions, verifySum, userSubscriptions, segments, gameToken);
    }
}
