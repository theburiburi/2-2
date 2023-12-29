public class WorldClock extends Clock{
    private int offset;

    /** WorldClock 클래스의 생성자입니다.
     * 
     * @param offset
     */
    public WorldClock(int offset)
    {
        this.offset = offset;
    }


    /** offset을 계산해주어서 world hours를 리턴해주는 메소드입니다.
     * 
     */
    public int getHours()
    {
        int localHours = super.getHours();
        int worldHours = (localHours + offset + 24) % 24;

        return worldHours;
    }

    /** offset을 리턴해주는 메소드입니다.
     * 
     * @return offset입니다.
     */
    public int getOffset()
    {
        return offset;
    }
}
