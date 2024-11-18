using System;
using Microsoft.Maui.Controls;

namespace nwm
{
    public partial class MainPage : ContentPage
    {
        int sum = 0; 

        public MainPage()
        {
            InitializeComponent();
        }
       
        private void OnChangeImageClicked(object sender, EventArgs e)
        {
            Random random = new Random();

            int dice1 = random.Next(1, 7);
            int dice2 = random.Next(1, 7);
            int dice3 = random.Next(1, 7);
            int dice4 = random.Next(1, 7);
            int dice5 = random.Next(1, 7);

            image1.Source = $"k{dice1}.png";
            image2.Source = $"k{dice2}.png";
            image3.Source = $"k{dice3}.png";
            image4.Source = $"k{dice4}.png";
            image5.Source = $"k{dice5}.png";

            int totalScore = dice1 + dice2 + dice3 + dice4 + dice5;
            sum += totalScore;

            resultLabel.Text = $"Wynik tego losowania: {totalScore}";
            resultGame.Text = $"Wynik gry: {sum}";  
        }

        private void OnResetClicked(object sender, EventArgs e)
        {
            image1.Source = "x.png";
            image2.Source = "x.png";
            image3.Source = "x.png";
            image4.Source = "x.png";
            image5.Source = "x.png";

            resultLabel.Text = "Wynik tego losowania: 0";
            resultGame.Text = "Wynik gry: 0";  
        }
    }
}
