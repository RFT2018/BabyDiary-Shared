package hu.unideb.inf.babydiary.commons.pojo.table;


import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ColumnName {

    public static final class UserColumName {

        public static final String COLUMN_NAME_USER_ID = "user_id";

        public static final String COLUMN_NAME_USERNAME = "username";

        public static final String COLUMN_NAME_PASSWORD = "password";

        public static final String COLUMN_NAME_EMAIL = "email";

        public static final String COLUMN_NAME_USER_FIRSTNAME = "user_firstname";

        public static final String COLUMN_NAME_USER_LASTNAME = "user_lastname";

        public static final String COLUMN_NAME_USER_SEX = "user_sex";
    }

    public static final class FamilyColumName {

        public static final String COLUMN_NAME_FAMILYNAME = "familyname";
    }

    public static final class ChildColumName {

        public static final String COLUMN_NAME_CHILD_ID = "child_id";

        public static final String COLUMN_NAME_BIRTHDAY = "birthday";

        public static final String COLUMN_NAME_HEIGHT = "height";

        public static final String COLUMN_NAME_WEIGHT = "weight";

        public static final String COLUMN_NAME_CONCEPTION = "conception";

        public static final String COLUMN_NAME_CHILD_FIRSTNAME = "child_firstname";

        public static final String COLUMN_NAME_CHILD_LASTNAME = "child_lastname";

        public static final String COLUMN_NAME_CHILD_SEX = "child_sex";
    }

    public static final class FunfactColumName {

        public static final String COLUMN_NAME_FUNFACT_ID = "funfact_id";

        public static final String COLUMN_NAME_WEEK = "week";

        public static final String COLUMN_NAME_TEXT = "text";

        public static final String COLUMN_NAME_MUSIC = "music";

        public static final String COLUMN_NAME_SKILLS = "skills";

        public static final String COLUMN_NAME_FOOD = "food";
    }

    public static final class WishListColumName {

        public static final String COLUMN_NAME_WISHLIST_ID = "wishlist_id";

        public static final String COLUMN_NAME_ITEM = "item";

        public static final String COLUMN_NAME_PRICE = "price";
    }

    public static final class AlbumColumName {

        public static final String COLUMN_NAME_ALBUM_ID = "album_id";

        public static final String COLUMN_NAME_NAME = "name";

        public static final String COLUMN_NAME_TYPE = "type";

        public static final String COLUMN_NAME_SIZE = "size";

        public static final String COLUMN_NAME_DATE = "date";
    }
}