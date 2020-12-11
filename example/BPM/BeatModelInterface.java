package example.BPM;

public interface BeatModelInterface {

    /***********************************************
     * 让控制器调用的，控制器根据用户的操作而对模型做的处理 *
    ************************************************/
    void initialize();
    void on();
    void off(); 
    void setBPM(int bpm);


    /***********************************************
     * 允许试图和控制区取得状态 *
    ************************************************/
    int getBPM();
    void registerObserver(BeatObserver o);
    void removeObserver(BeatObserver o);
    void registerObserver(BPMObserver o);
    void removeObserver(BPMObserver o);

}
