package HotelManagement;

public class Tier {
    private boolean poolAccess;
    private boolean gymAccess;
    private boolean pcAccess;
    private boolean buffetAccess;
    private boolean barAccess;
    private boolean hotTubAccess;
    private boolean casinoAccess;
    private boolean arcadeAccess;
    private boolean roomAccess;
    private boolean janitorRoomAccess;
    private int tier;

    public Tier(int tierLevel){
        tierLevel = tier;
        checkPermissions();
    }

    public void checkPermissions(){
        switch (tier){
            case 1:
                poolAccess = true;
                pcAccess = true;
                hotTubAccess = false;
                gymAccess = false;
                barAccess = false;
                casinoAccess = false;
                buffetAccess = false;
                arcadeAccess = false;
                break;
            case 2:
                poolAccess = true;
                pcAccess = true;
                hotTubAccess = true;
                gymAccess = false;
                barAccess = false;
                casinoAccess = false;
                buffetAccess = false;
                arcadeAccess = false;
                break;
            case 3:
                poolAccess = true;
                pcAccess = true;
                hotTubAccess = true;
                gymAccess = true;
                barAccess = false;
                casinoAccess = false;
                buffetAccess = false;
                arcadeAccess = false;
                break;
            case 4:
                poolAccess = true;
                pcAccess = true;
                hotTubAccess = true;
                gymAccess = true;
                barAccess = true;
                casinoAccess = true;
                buffetAccess = false;
                arcadeAccess = false;
                break;
            case 5:
                poolAccess = true;
                pcAccess = true;
                hotTubAccess = true;
                gymAccess = true;
                barAccess = true;
                casinoAccess = true;
                buffetAccess = true;
                arcadeAccess = true;
                break;
            case 6: // Admin Access
                poolAccess = true;
                pcAccess = true;
                hotTubAccess = true;
                gymAccess = true;
                barAccess = true;
                casinoAccess = true;
                buffetAccess = true;
                arcadeAccess = true;
                roomAccess = true;
                janitorRoomAccess = true;
            default:
                System.out.println("You have chosen no package..");
        }

    }
}
