# Predicting Thalassemia Transmission Using Markov Processes

This project explores the use of Markov processes to predict the transmission of thalassemia across generations. By modeling genotype inheritance probabilities, the project provides insights into when the severe traits of thalassemia might be mitigated or eliminated in a family line.

## Table of Contents
- [Introduction](#introduction)
- [Problem Statement](#problem-statement)
- [Approach](#approach)
- [Results](#results)
- [Technologies Used](#technologies-used)
- [Usage](#usage)
- [References](#references)

## Introduction
Thalassemia is an inherited blood disorder caused by the deficiency of hemoglobin and red blood cells. This project models inheritance patterns using Markov processes to determine the likelihood of severe traits diminishing over generations.

## Problem Statement
Thalassemia traits cannot be entirely eliminated but can be minimized in severity over generations. By selecting appropriate genotypes in parental pairs, the model predicts the probability of children being unaffected, carriers, or affected by thalassemia across generations.

## Approach
- **Mathematical Modeling**: Utilizes Markov processes to calculate the probability distribution of thalassemia genotypes across generations.
- **Visualization**: Graphs display the likelihood of a child having specific genotypes (unaffected, carrier, or affected) based on parental genotypes.
- **Simulation**: Scenarios include different parental genotypes, such as unaffected, carrier, or affected, and their impact on offspring over 10 generations.

## Results
1. **Parent with Unaffected Genotype**: Probability of a child being unaffected decreases over generations, while the probability of being affected increases slightly.
2. **Parent with Carrier Genotype**: Probability of a child being unaffected and affected decreases, while being a carrier remains constant.
3. **Parent with Affected Genotype**: Probability of a child being affected decreases over generations, as marrying an unaffected partner mitigates the trait.
<p align="center">
  <img width="600" alt="Screenshot 2025-01-09 at 6 02 09 PM" src="https://github.com/rajvi-patel-22/Thalassemia-Probability-Project/blob/master/Cmap-2.jpg" />


## Technologies Used
- **Languages**: MATLAB
- **Tools**: MATLAB's plotting and simulation functionalities
- **References**: Published research papers on thalassemia and Markov processes.

## Usage
1. Clone the repository:
   ```bash
   git clone https://github.com/rajvi-patel-22/thalassemia-prediction.git
   ```
2. Open the MATLAB project file in your MATLAB environment.
3. Run the main script (prp.m) to generate results and visualizations.
4. Review the output graphs to analyze genotype inheritance probabilities.

## References
- S. Thakur, S. N. Raw, and R. Sharma, "A Mathematical Model to Control the Transmission of Thalassemia Disease using Pure Fractions," Indian Journal of Science and Technology, 2016.
- Dr. Hamidreza Shirzadfar, "Critical Review on Thalassemia: Types, Symptoms, and Treatment," 2018.
- Grinstead, C. and Snell, J., "Introduction to Probability," American Mathematical Society, 2006.
